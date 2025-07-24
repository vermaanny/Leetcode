package org.example.arrays;

/**
 * Given an array  arr[] of size n and an integer k, the task is to insert a duplicate of k adjacent to its every occurrence. Keep array's original length same by removing the elements from the back.
 */
public class DuplicateInArray {

    public static void main(String... args) {

        int[] array = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] output = updateDuplicates(array);
        for (int j : output) {
            System.out.print(j);
            System.out.print(" ,");
        }
    }

    public static int[] updateDuplicates(int[] input) {

        int[] output = new int[input.length];
        int index = 0;
        int k = 0;
        for (int i = 0; i < input.length && index < input.length; i++) {
            if (input[i] == 0) {
                if (index < input.length) {
                    output[index++] = input[i];
                    output[index++] = input[i];
                }

            } else {
                output[index++] = input[i];
            }
        }
        return output;
    }

}

