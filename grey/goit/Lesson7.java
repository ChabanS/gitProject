package grey.goit;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by grey on 23.10.2015.
 */
public class Lesson7 {

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'R', 'a', '@', '%', 'h', '7', 'A', 'F'};
        System.out.println(sortCharRevers(sortChar(remoteChar(array))));
    }

    public static char[] sortChar(char[] arrayRemote) {

        Arrays.sort(arrayRemote);
        return arrayRemote;
    }

    public static char[] sortCharRevers(char[] arrayRemote){
        char[] arrayRevers =new char[arrayRemote.length];
        for (int i=0; i<arrayRemote.length; i++){
            arrayRevers[arrayRemote.length-1-i]=arrayRemote[i];
        }
        return arrayRevers;
    }

    public static char[] remoteChar(char[] array){
        char[] arrayRemote =new char[array.length];
        for (int i=0; i<array.length; i++){
            int n=(int) array[i];
            if ((n>96&&n<123)||(n>64&&n<91)){
                arrayRemote[i]=array[i];
            }
        }
        return arrayRemote;
    }
}
