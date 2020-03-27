package com.example.recycleview_project_iva;

public class Movie {
    private String title;
    private String genre;
    private long year;

    public Movie(String title, String genre, long year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public long getYear() {
        return year;
    }

}
