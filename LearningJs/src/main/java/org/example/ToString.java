package org.example;

public class ToString {
    public static void test (int array[][]) {
        System.out.print("\t");
        for (int i = 0; i < array[0].length; i++) {
            System.out.print(i + "\t");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
