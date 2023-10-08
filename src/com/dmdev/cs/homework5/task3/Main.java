package com.dmdev.cs.homework5.task3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Movie shawshankRedemption = new Movie(1, 1994, 9, "Drama", 1);
        Movie godFather = new Movie(2, 1972, 3, "Crime", 2);
        Movie  darkKnight = new Movie(3, 2008, 7, "Action", 3);
        Movie schindlerList = new Movie(4, 1993, 11, "Biography", 4);
        Movie lordOfTheRings = new Movie(5, 2003, 12, "Adventure", 5);
        Movie angryMen = new Movie(6, 1957, 4, "Drama", 6);
        Movie pulpFiction = new Movie(7, 1994, 5, "Crime", 7);
        Movie fightClub = new Movie(8, 1999, 9, "Drama", 8);
        Movie inception = new Movie(9, 2010, 7, "Sci-Fi", 9);
        Movie forrestGump = new Movie(10, 1994, 7, "Drama", 10);
        Movie spiderMan = new Movie(11, 2023, 5, "Animation", 11);
        Movie interstellar = new Movie(12, 2014, 10, "Sci-Fi", 12);

        Map<Integer, List<Movie>> movieMap = new LinkedHashMap<>();
        Cinema cinema = new Cinema(movieMap);
        cinema.addMovie(shawshankRedemption);
        cinema.addMovie(godFather);
        cinema.addMovie(darkKnight);
        cinema.addMovie(spiderMan);
        cinema.addMovie(inception);
        cinema.addMovie(fightClub);
        cinema.addMovie(forrestGump);
        cinema.addMovie(pulpFiction);
        cinema.addMovie(angryMen);
        cinema.addMovie(lordOfTheRings);
        cinema.addMovie(schindlerList);
        cinema.addMovie(interstellar);
        List<Movie> moviesByYear = cinema.getMoviesByYear(1994);
        List<Movie> moviesByYearAndMonth = cinema.getMoviesByYearAndMonth(1994, 7);
        List<Movie> moviesByGenre = cinema.getMoviesByGenre("Sci-Fi");
        List<Movie> top10 = cinema.getTop10();
        System.out.println(cinema);
        System.out.println(moviesByYear);
        System.out.println(moviesByYearAndMonth);
        System.out.println(moviesByGenre);
        System.out.println(top10);
    }
}
