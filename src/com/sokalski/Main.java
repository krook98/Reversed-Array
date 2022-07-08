package com.sokalski;

//-Write a method called reverse() with an int array as a parameter.
//
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
//
//        Tip:
//        -Create a new console project with the name ÅeReverseArrayChallengeÅf
//

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
    }

    private static void reverse(int[] myArray) {
        int[] reversed = new int[myArray.length];
        int counter = 0;
        for(int i = myArray.length - 1; i>-1; i--) {
            reversed[counter] = myArray[i];
            counter++;
        }
        System.out.println("Non-reversed: " + Arrays.toString(myArray) + "\n");
        System.out.println("Reversed: " + Arrays.toString(reversed) + "\n");

    }
}
