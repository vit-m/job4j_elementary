package ru.job4j;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row += 1) {
            for (int cell = 0; cell < width; cell += 1) {
                if ((cell + row) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(5, 5);
    }
}
