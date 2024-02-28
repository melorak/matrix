package org.example;

import java.util.Arrays;
import java.util.Random;

public class Mane {
    public static void main (String[] args) {
        final int columns = 100;
        final int height = 100;
        int [][] array = new int[columns][height];

        Random random = new Random();
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < height; j++) {
                array[i][j] = random.nextInt(0, 2);
            }
        }
        ToString.test(array);
    }
}



