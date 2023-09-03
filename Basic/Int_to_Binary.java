import java.util.*;

public class Int_to_Binary {
    public static void printbinary(int i, int[] arr) {
        while (i != -1) {
            System.out.print(arr[i] + " ");
            i--;
        }
    }

    private static void decimaltobinary(int num) {
        int arr[] = new int[32];
        int i = 0;
        while (num != 0) {
            arr[i++] = num % 2;
            num = num / 2;
        }
        printbinary(i - 1, arr);
    }
    public static void decimaltobinary1(int num){
        System.out.println(Integer.toBinaryString(num)); //Using Inuilt function
    }
    public static void decimaltobinary2(int num){
        int binary=0;
        int i=1;
        int digit=0;
        while(num!=0){
            digit=num%2;
            num=num/2;

            binary+=digit*i;
            i=i*10;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        int num = 10;
        decimaltobinary2(num);
    }

}