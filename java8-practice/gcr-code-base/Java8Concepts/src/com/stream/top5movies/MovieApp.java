package com.stream.top5movies;

import java.util.*;

//Main class
public class MovieApp {

 public static void main(String[] args) {

     // Movie list
     List<Movie> movies = Arrays.asList(
             new Movie("Movie A", 8.5, 2024),
             new Movie("Movie B", 7.2, 2023),
             new Movie("Movie C", 9.0, 2024),
             new Movie("Movie D", 8.8, 2022),
             new Movie("Movie E", 9.1, 2023),
             new Movie("Movie F", 8.9, 2024),
             new Movie("Movie G", 6.9, 2021)
     );

     // Fetch and display top 5 trending movies
     List<Movie> topMovies = MovieService.getTopTrendingMovies(movies);
     topMovies.forEach(System.out::println);
 }
}
