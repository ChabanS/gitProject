package grey.goit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
<<<<<<< HEAD
 * Created by grey on 08.11.2015. 
=======
 * Created by grey on 08.11.2015. (branch master)
>>>>>>> master
 */
public class DataConverter  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int num;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DataConverter converter = new DataConverter();
        menu();
        int enter = Integer.parseInt(reader.readLine());
        if (enter==1){
            converter.binaryToHex();
        }
        else if (enter==2){
            converter.hexToBinary();
        }
        else if (enter==3){
            converter.binaryToDecimal();
        }
        else if (enter==4){
            converter.decimalToBinary();
        }
        else if (enter==5){
            converter.decimalToHex();
        }
        else if (enter==6){
            converter.hexToDecimal();
        }
        else{System.out.println("You enter incorrect number.");}

    }

    public void binaryToHex() throws IOException {

        System.out.println("Binary to Hex");
        System.out.println("\nEnter the number :");
        num = Integer.parseInt(reader.readLine(), 2);
        String hexString = Integer.toHexString(num);
        System.out.println("Hex Value is : " + hexString);
    }
    public void hexToBinary() throws IOException {

        System.out.println("Hex to Binary");
        System.out.println("\nEnter the number :");
        num = Integer.parseInt(reader.readLine(), 16);
        String binaryString = Integer.toBinaryString(num);
        System.out.println("Binary Value is : " + binaryString);
    }
    public void binaryToDecimal() throws IOException {

        System.out.println("Binary to Decimal");
        System.out.println("\nEnter the number :");
        num = Integer.parseInt(reader.readLine(), 2);
        String decimalString = Integer.toString(num);
        System.out.println("Decimal Value is : " + decimalString);
    }
    public void decimalToBinary() throws IOException {

        System.out.println("Decimal to Binary");
        System.out.println("\nEnter the number :");
        num = Integer.parseInt(reader.readLine());
        String decimalString = Integer.toBinaryString(num);
        System.out.println("Binary Value is : " + decimalString);
    }
    public void decimalToHex() throws IOException {

        System.out.println("Decimal to Hex");
        System.out.println("\nEnter the number :");
        num = Integer.parseInt(reader.readLine());
        String hexString = Integer.toHexString(num);
        System.out.println("Hex Value is : " + hexString);
    }
    public void hexToDecimal() throws IOException {

        System.out.println("Hex to Decimal");
        System.out.println("\nEnter the number :");
        num = Integer.parseInt(reader.readLine(), 16);
        String binaryString = Integer.toString(num);
        System.out.println("Decimal Value is : " + binaryString);
    }
    public static void menu(){
        System.out.println("What you want convert?");
        System.out.println("Binary to Hex - enter 1");
        System.out.println("Hex to Binary - enter 2");
        System.out.println("Binary to Decimal - enter 3");
        System.out.println("Decimal to Binary - enter 4");
        System.out.println("Decimal to Hex - enter 5");
        System.out.println("Hex to Decimal - enter 6");
    }

}
