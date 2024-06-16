package ru.gertru;

public class Task6 {

    public static void main(String[] args) {

        String[] gamers = new String[10];

        for (int i = 0; i < gamers.length; i++) {
            gamers[i] = "Игрок №" + i;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(gamers[i]);
        }
    }
}
