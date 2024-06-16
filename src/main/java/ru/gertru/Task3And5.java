package ru.gertru;

public class Task3And5 {

    public static void main(String[] args) {

        // Задание 3
        Movie[] films = new Movie[3];
        films[0] = new Movie("1+1", 9, "драма, комедия", "Франция", false, 2011);
        films[1] = new Movie("Интерстеллар", 8, "фантастика, драма, приключения", "США, Великобритания, Канада", true, 2014);
        films[2] = new Movie("Зеленая миля", 9, "драма, фэнтези, криминал", "США", false, 1999);

        // Задание 5
        for (Movie film : films) {
            System.out.println(film.year + " - " + film.name + " - " + film.genre + " - " + film.rating);
        }
    }
}
