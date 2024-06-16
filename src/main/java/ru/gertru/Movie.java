package ru.gertru;

public class Movie {
    String name;
    int rating;
    String genre;
    String country;
    boolean hasOscar;
    int year;

    public Movie(String name, int rating, String genre, String country, boolean hasOscar, int year) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
        this.year = year;
    }

}
