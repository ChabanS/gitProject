package grey.goit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by grey on 31.10.2015.
 */
public class Lesson9 {
    public static final int FIRST_LETTER_ASCII = 97;
    public static final int LATEST_LETTER_ASCII = 122;
    public static final int QUANTITY_LETTERS_IN_ALPHABET = (LATEST_LETTER_ASCII-FIRST_LETTER_ASCII+1);

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the key: ");
        int key=Integer.parseInt(reader.readLine());
            System.out.print("Enter the text for encryption: ");
        String myString = reader.readLine();

            System.out.print("Encryption text: ");
        char[] encryption = encryption((createArrayCharString(myString)), key);
            System.out.println(encryption);

            System.out.print("Decryption text: ");
        char[] decryption = decryption(encryption, key);
            System.out.println(decryption);

    }

    public static char[] createArrayCharAlphabet(){
        char[] array = new char[QUANTITY_LETTERS_IN_ALPHABET];
        int i = 0;
        while (i<QUANTITY_LETTERS_IN_ALPHABET){
            int n=FIRST_LETTER_ASCII+i;
            array[i]=(char)n;
            i++;
        }
        return array;
    }

    public static char[] createArrayCharString(String string){
        char [] myCharArray = string.toCharArray();
        return myCharArray;
    }

    public static char[] encryption(char[] chars, int key){
        char[] charAlphabet = createArrayCharAlphabet();
        char[] encryptionText = new char[chars.length];
        for (int i=0; i<chars.length; i++){
            for (int j=0; j<charAlphabet.length; j++){
                if (chars[i]==charAlphabet[j]){
                    encryptionText[i]= charAlphabet[(((j+key)%QUANTITY_LETTERS_IN_ALPHABET))];
                }
            }
        }
        return encryptionText;
    }

    public static char[] decryption(char[] chars, int key){
        char[] charAlphabet = createArrayCharAlphabet();
        char[] decryptionText = new char[chars.length];
        for (int i=0; i<chars.length; i++){
            for (int j=0; j<charAlphabet.length; j++){
                if (chars[i]==charAlphabet[j]){
                    decryptionText[i]= charAlphabet[(((j-key+QUANTITY_LETTERS_IN_ALPHABET)%QUANTITY_LETTERS_IN_ALPHABET))];
                }
            }
        }
        return decryptionText;
    }

}
