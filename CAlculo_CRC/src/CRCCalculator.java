import java.util.Scanner;

public class CRCCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el mensaje en binario: ");
        String message = scanner.nextLine();

        System.out.print("Ingrese el polinomio generador en binario: ");
        String generator = scanner.nextLine();

        String crc = calculateCRC(message, generator);

        System.out.println("El CRC calculado es: " + crc);

        scanner.close();
    }

    public static String calculateCRC(String message, String generator) {
        int messageLength = message.length();
        int generatorLength = generator.length();

        // Agregar ceros al final del mensaje igual a la longitud del generador
        String extendedMessage = message;
        for (int i = 0; i < generatorLength - 1; i++) {
            extendedMessage += "0";
        }

        // Convertir el generador y el mensaje extendido a arreglos de caracteres
        char[] messageArray = extendedMessage.toCharArray();
        char[] generatorArray = generator.toCharArray();

        // Realizar la operación XOR
        for (int i = 0; i < messageLength; i++) {
            if (messageArray[i] == '1') {
                for (int j = 0; j < generatorLength; j++) {
                    messageArray[i + j] = (messageArray[i + j] == generatorArray[j]) ? '0' : '1';
                }
            }
        }

        // Obtener el CRC del mensaje extendido
        String crc = String.valueOf(messageArray, messageLength, generatorLength - 1);
        return crc;
    }
}
