package com.dmdev.cs.homework5.task3;

import com.dmdev.cs.homework5.task1.Chat;

import java.util.*;

public class Cinema {

    private Map<Integer, List<Movie>> movieMap = new LinkedHashMap<>();

    public Cinema(Map<Integer, List<Movie>> movieMap) {
        this.movieMap = movieMap;
    }

    public Map<Integer, List<Movie>> getMovieMap() {
        return movieMap;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(movieMap, cinema.movieMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieMap);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "movieMap=" + movieMap +
                '}';
    }

    public void addMovie(Movie movie) {
        if (movieMap.containsKey(movie.getYear())) {
            List<Movie> movies = movieMap.get(movie.getYear());
            if (!movies.contains(movie)) {
                movies.add(movie);
            }
        } else {
            List<Movie> movies = new ArrayList<>();
            movies.add(movie);
            movieMap.put(movie.getYear(), movies);
        }
    }

    public List<Movie> getMoviesByYear(int year) {
        return movieMap.get(year);
    }

    public List<Movie> getMoviesByYearAndMonth(int year, int month) {
        List<Movie> moviesByYear = getMoviesByYear(year);
        List<Movie> moviesByYearAndMonth = new ArrayList<>();
        for (Movie movie : moviesByYear) {
            if (movie.getMonth() == month) {
                moviesByYearAndMonth.add(movie);
            }
        }
        return moviesByYearAndMonth;
    }

    public List<Movie> getMoviesByGenre(String genre) {
        Collection<List<Movie>> values = movieMap.values();
        List<Movie> moviesByGenre = new ArrayList<>();
        for (List<Movie> value : values) {
            for (Movie movie : value) {
                if (movie.getGenre().equals(genre)) {
                    moviesByGenre.add(movie);
                }
            }
        }
        return moviesByGenre;
    }

    public List<Movie> getTop10() {
        Collection<List<Movie>> values = movieMap.values();
        List<Movie> movies = new ArrayList<>();
        for (List<Movie> value : values) {
            for (Movie movie : value) {
                movies.add(movie);
            }
        }
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getRating().compareTo(o2.getRating());
            }
        });

        Iterator<Movie> iterator = movies.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Movie next = iterator.next();
            count++;
            if (count > 10) {
                iterator.remove();
            }
        }
        return movies;
    }
}
