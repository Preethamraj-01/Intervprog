package Dsa;
import java.util.Arrays;

public class ArrayClassCollectnFrame {
    public static void main(String[] args) {

//       int[] numbers = { 1, 2, 3,  5, 6, 7, 8, 9, 10 ,100};
//        int index = Arrays.binarySearch(numbers, 100);
////
//       System.out.println("The index of element 100 in the array is " + index);

            Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
            Arrays.sort(numbers);//uses sequential/quick sort ,used for small number of elements

        System.out.println("After sorting");
            for (Integer i:numbers)
        System.out.print(" "+i);

        System.out.println();

            Arrays.parallelSort(numbers);//it takes lesser time for large number of elements since it uses mergesort algo to sort elements
            // 8192
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.fill(numbers, 12);

            for (int i : numbers) {
                System.out.print(i + " ");
            }



        }
    }


