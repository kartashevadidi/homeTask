package org.example.homeTask.hm_3.task_6;

import java.util.Arrays;

public class ElementsFromAnotherArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int countOfEvenNumbers = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                countOfEvenNumbers++;
            }
        }

        int[] arrayOfEvenNumbers = new int[countOfEvenNumbers];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayOfEvenNumbers[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arrayOfEvenNumbers));
    }
}
// .. Я бы хотела обсудить на заняти этот комментарий
//        int[] arrayOfEvenNumbers = new int[countOfEvenNumbers];
//        int indexCount = 0; // foreach отличается от for отсутствием индексации, если тебе нужен индекс, используй обычный for
//        for (int i : array) {
//            if (i % 2 == 0) {
//                arrayOfEvenNumbers[indexCount++] = i;
//            }
//        }
