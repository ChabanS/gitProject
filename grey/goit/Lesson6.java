package grey.goit;

/**
 * Created by grey on 21.10.2015.
 * Find maximum and minimum elements of array
 * int ar[] = {2,3,-1,6,6,6,7,8,9,0,11111}
 */
public class Lesson6 {

    public static void main(String[] args) {
        int ar[] = {2,3,-1,6,6,6,7,8,9,0,11111};
        int max = max(ar);
        int min = min(ar);
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }

    //максимальное значение
    public static int max(int[] ar) {
        int max = 0;
        for (int i = 0; i < ar.length; i++){
            if (max < ar[i]){
                max=ar[i];
            }
        }
        return max;
    }
    //минимальное значение
    public static int min(int[] ar) {
        int min = 0;
        for (int i = 0; i < ar.length; i++){
            if (min > ar[i]){
                min=ar[i];
            }
        }
        return min;
    }

}
