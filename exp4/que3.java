package exp4;

import java.util.*;

public class que3 {
    String message;
    int key;

    public que3(String message, int key) {
        this.message = message;
        this.key = key;
    }

    public static String codedecode(String message, int key) {
        StringBuilder decryptedMessage = new StringBuilder();
        char decryptedChar;
        for (int i = 0; i < message.length(); i++) {
            char originalChar = message.charAt(i);
            if (originalChar == 32) {
                decryptedChar = originalChar;
            } else {
                int decryptedCharCode = (int) originalChar - key;
                if (decryptedCharCode < 32) {
                    decryptedCharCode = 127 - (32 - decryptedCharCode);
                }
                decryptedChar = (char) decryptedCharCode;
            }
            decryptedMessage.append(decryptedChar);
        }
        return decryptedMessage.toString();
    }

    public static void main(String[] args) {
        String interceptedMessage = ":mmZ\\dxZmx]Zpgy";
        for (int key = 1; key <= 100; key++) {
            String decryptedMessage = codedecode(interceptedMessage, key);
            System.out.println("Key " + key + ": " + decryptedMessage);
        }
    }
}
