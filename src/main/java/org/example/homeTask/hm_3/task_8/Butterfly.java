package org.example.homeTask.hm_3.task_8;

import java.util.Arrays;

public class Butterfly {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; i < array.length; j--);
        }
        System.out.println(Arrays.toString(array));

    }
}
