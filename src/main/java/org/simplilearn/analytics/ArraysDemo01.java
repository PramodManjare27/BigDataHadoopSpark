package org.simplilearn.analytics;
/*

Array creation can be explained using 3 steps

1. Array Declaration
2. Array Instantiation
3. Array Initialization

 */

public class ArraysDemo01 {
    public static void main(String[] args) {
        // Array Declaration
        int[] numbers;

        // Array Instantiation
        numbers = new int[5];
        numbers[3]=10;
        System.out.println(numbers[4]);

        // Iterate over a collection array
        System.out.println("Iterating a collection using a for loop");
       /* for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }*/
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Iterating using enhanced for loop / for each");
//        for(int num:numbers){
//            System.out.println(num);
//        }

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
