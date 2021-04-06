
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class gopmang {
    public static void main(String[] args) {
        int size1;
        int[] array1;
        int size2;
        int[] array2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size1 = scanner.nextInt();
            if (size1 > 20)
                System.out.println("Size should not exceed 20");
        } while (size1 > 20);
        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("First array: ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        do {
            System.out.print("Enter a size:");
            size2 = scanner.nextInt();
            if (size2 > 20)
                System.out.println("Size should not exceed 20");
        } while (size2 > 20);
        array2 = new int[size2];
        i=0;
        while (i < array2.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array2[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Second array: ");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }
        int [] array3 = new int[size1+size2];
        array3 = mergearray(array1,array2);
        System.out.print("New property list: ");
        for (int j =0;j< array3.length;j++){
            System.out.print(array3[j] + "\t");
        }
    }
    public static int[] mergearray(int []arr1,int []arr2){
        int [] arr3 = new int[arr1.length+ arr2.length];
        int index=0;
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=arr1.length;i< arr3.length;i++){
            arr3[i]=arr2[index];
            index++;
        }
        return arr3;
    }
}
