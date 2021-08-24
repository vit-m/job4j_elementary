package ru.job4j;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row += 1) {
            for (int cell = 0; cell < size; cell += 1) {
                boolean left = (row == cell);
                boolean right = ((cell + row) == (size - 1));
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
