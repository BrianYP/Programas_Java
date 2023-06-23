import java.util.Arrays;

public class MPSK {
    public static void main(String[] args) {
        int[] dataBits = {0,1,0,0,1,1,0,0}; // Datos de entrada (bits)
        int m = 4; // Número de símbolos de la modulación M-PSK (en este caso, 4-PSK)

        // Calcula el número de bits por símbolo
        int bitsPerSymbol = (int) (Math.log(m) / Math.log(2));

        // Calcula el número total de símbolos necesarios
        int totalSymbols = dataBits.length / bitsPerSymbol;

        // Asegura que el tamaño de los datos de entrada es múltiplo del número de bits por símbolo
        if (dataBits.length % bitsPerSymbol != 0) {
            System.out.println("El tamaño de los datos de entrada no es válido para la modulación M-PSK.");
            return;
        }

        // Inicializa los arrays para almacenar los símbolos y la señal modulada
        int[] symbols = new int[totalSymbols];
        double[] modulatedSignal = new double[totalSymbols];

        // Convierte los bits de entrada en símbolos
        for (int i = 0; i < totalSymbols; i++) {
            String symbolStr = "";
            for (int j = 0; j < bitsPerSymbol; j++) {
                int bit = dataBits[i * bitsPerSymbol + j];
                symbolStr += bit;
            }
            symbols[i] = Integer.parseInt(symbolStr, 2);
        }

        // Realiza la modulación M-PSK
        double phaseIncrement = 2 * Math.PI / m;
        for (int i = 0; i < totalSymbols; i++) {
            double phase = symbols[i] * phaseIncrement;
            modulatedSignal[i] = Math.cos(phase); // Señal en fase
        }

        // Imprime los resultados
        System.out.println("Símbolos de entrada: " + Arrays.toString(symbols));
        System.out.println("Señal modulada: " + Arrays.toString(modulatedSignal));
    }
}
