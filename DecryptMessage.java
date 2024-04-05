import java.util.*;

public class DecryptMessage {
    public static void main(String[] args) {
        String encryptedText = "DiArJTs0JzgjJDYgOj0+Y2U7JiBzPiApNCwxczknIGIrOj04PGUzPDAgOSYqLGhfWW1vZWJpdXNtb2ViaXVzbW9lYml1c21vZWJpdXNtb2ViaXVzY2hibEN1c21vZWJpe3RqYWViaXVzbWFlYml1c21vZWhucnltb2VicwoPYhB/Yml1c21hT2JpdXNtb38dFXoMd29lYhYJe2IQZWJnb31nEBltFn9zbW9/YmYJc3dvZWxue2ljaGtIaXV9amhreGl6D211ZWJpe3xkE2ViaXJpamVlbRV1eW11ZWJue31qYWViZGhpInV4b0N1aRITah1zcn13dX9saXVzbWhlaG5yeW1vZWJjdXRjaGpsbnUMEWdqHW57dHdoa2VDdWltYBlic3Vpd3V/eGl1c21vbx0Vegxnb2ViaXV+cG8qYnR4c21gbB5pdXNtaE9iaXJ9Y2hlYm5vaXdoZWJpdXNnb2oeaX9zbW9lYmdyfGNoa2JpdXRHb2ViaXVzbW9lYml1c21vZWJpdXljYW9iaXVzbW9lYmlvWQ==";
        String key = "MOEBIUS";

        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
        String decodedText = new String(decodedBytes);
        String decryptedText = decrypt(decodedText, key);

        System.out.println(decryptedText);
    }

    private static String decrypt(String encryptedText, String key) {
        int keyIndex = 0;
        int keyLength = key.length();
        StringBuilder decryptedText = new StringBuilder();

        char[] encryptedArray = encryptedText.toCharArray();
        for (int i = 0; i < encryptedArray.length; i++) {
            char decryptedChar = (char) (encryptedArray[i] ^ key.charAt(keyIndex));
            decryptedText.append(decryptedChar);
            keyIndex = (keyIndex + 1) % keyLength;
        }

        return decryptedText.toString();
    }
}
