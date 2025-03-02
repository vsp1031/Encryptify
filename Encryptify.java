import java.util.Scanner;
// CaesarCipher
public class Encryptify {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    // Method to encrypt a message
    public static String encrypt(String message, int shiftKey) {
        message = message.toLowerCase();
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int charPosition = ALPHABET.indexOf(currentChar);
            if (charPosition == -1) {
                cipherText.append(currentChar); // Keep non-alphabet characters unchanged
            } else {
                int keyVal = (charPosition + shiftKey) % 26;
                cipherText.append(ALPHABET.charAt(keyVal));
            }
        }
        return cipherText.toString();
    }

    // Method to decrypt a message
    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            char currentChar = cipherText.charAt(i);
            int charPosition = ALPHABET.indexOf(currentChar);
            if (charPosition == -1) {
                message.append(currentChar); // Keep non-alphabet characters unchanged
            } else {
                int keyVal = (charPosition - shiftKey + 26) % 26;
                message.append(ALPHABET.charAt(keyVal));
            }
        }
        return message.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to Encrypt or Decrypt? (E/D): ");
        char choice = sc.next().charAt(0);

        System.out.print("Enter the message: ");
        sc.nextLine(); // Consume the newline left by next()
        String message = sc.nextLine();

        System.out.print("Enter the Shift Key: ");
        int key = sc.nextInt();

        if (choice == 'E' || choice == 'e') {
            System.out.println("Encrypted Message: " + encrypt(message, key));
        } else if (choice == 'D' || choice == 'd') {
            System.out.println("Decrypted Message: " + decrypt(message, key));
        } else {
            System.out.println("Invalid choice! Please enter 'E' for Encryption or 'D' for Decryption.");
        }

        sc.close();
    }
}
