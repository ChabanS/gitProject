package grey.goit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by grey on 28.10.2015.
 */
public class Lesson8a {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = "Hello world !!!";
            deleteSpace(string);

        System.out.print("Input string: ");
        String string3 = reader.readLine(); //"Brave new world";
            newString(string3);
    }

    public static String newString(String string){
        String stringNew = "new";
        if (string.contains(stringNew)){
            int s = string.lastIndexOf(stringNew);
            string = string.substring(s+4);
            System.out.println(string);
            //System.out.println(s);
        }
        return string;
    }

    public  static String deleteSpace(String string){
        System.out.println(string);
            String string2 = string.replaceAll(" ", "");
        System.out.println(string2);
        System.out.println();
            return string2;
    }
}
