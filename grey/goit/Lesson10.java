package grey.goit;

import java.io.*;

/**
 * Created by grey on 04.11.2015.
 */

/*
Хотел попросить, если не сложно, указать на мои ошибки. Или где можно было бы проще и эфективнее написать.
Спасибо!)
 */
public class Lesson10 {



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String quit="quit";
        String fileName;
        do {
            System.out.println("Input PATH with fileName (example D://text.txt):");
            System.out.println("To exit, type \"quit\"");
            fileName = reader.readLine();
        if (!fileName.equals(quit)) {

            try {
                exists(fileName);
                fileIsEmpty(fileName);
                write(fileName, fibonacciSequence(createArrayFromFile(fileName)));
            } catch (FileNotFoundException e) {
                System.out.println("File " + e.getMessage() + " not found.");
            } catch (IOException e) {
                System.out.println("File " + e.getMessage() + " is empty.");
            }
        }
        } while (!fileName.equals(quit));
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }

    private static void fileIsEmpty(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.length() == 0){
            throw new IOException(file.getName());
        }
    }

    public static int[] createArrayFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        String line = "";
        StringBuilder stringBuilder= new StringBuilder();
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append(" ");
            }
        String[] a = stringBuilder.toString().split(" ");
        int arrayInt[] = new int[a.length];
            for (int j = 0; j < a.length; j++) {
                arrayInt[j] = Integer.parseInt(a[j]);
                //System.out.println(arrayInt[j]);
            }
        return arrayInt;
    }

    public static String fibonacciSequence(int[] array){
        String fibonacci = "Fibonacci sequence";
        for(int i = 0; i < array.length-2; i++){
            int a = array[i];
            int b = array[i+1];
            int sum_fib;
            sum_fib = a + b;
            if (array[i+2]!=sum_fib){
                fibonacci="Not fibonacci sequence";
            }
        }
        System.out.println(fibonacci);
        System.out.println();
        return fibonacci;
    }

    public static void write(String fileName, String newText) throws IOException {
        File file = new File(fileName);
        FileOutputStream writer = new FileOutputStream(file, true);
        byte[] newTextInBytes = newText.getBytes();
        writer.write(newTextInBytes);
        writer.flush();
        writer.close();
    }
}
