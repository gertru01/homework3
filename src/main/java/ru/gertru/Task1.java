package ru.gertru;

public class Task1 {

    public static void main(String[] args) {

        String[] todoList = new String[5];
        for (int i = 0; i < todoList.length; i++) {
            todoList[i] = "Объект массива №" + (i + 1);
            System.out.println(todoList[i]);
        }
    }
}
