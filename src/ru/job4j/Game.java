package ru.job4j;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start - Super Mario");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - Tanks");
        }
        if (name.equals("tetris")) {
            System.out.println("Start - Tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
