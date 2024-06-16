package ru.gertru;

public class Task2 {
    public static void main(String[] args) {
        double[] coolNumbers = new double[3];
        coolNumbers[0] = Math.PI;
        coolNumbers[1] = Math.E;
        coolNumbers[2] = 1.0;
        for (int i = 0; i < coolNumbers.length; i++) {
            //Про целые числа в задании ничего не сказано, так что они тоже с 5-ю знаками после запятой
            System.out.printf("Number №" + i + " - %.5f\n", coolNumbers[i]);
        }

    }
}
