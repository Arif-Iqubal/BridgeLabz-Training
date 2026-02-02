package com.stream.top5movies;

import java.util.*;
import java.util.stream.Collectors;

// Service class for movie operations
public class MovieService {

	// Find top 5 trending movies based on rating and release year
	public static List<Movie> getTopTrendingMovies(List<Movie> movies) {
		return movies.stream().filter(m -> m.getReleaseYear() >= 2022) // recent movies
				.sorted((m1, m2) -> Double.compare(m2.getRating(), m1.getRating())) // sort by rating
				.limit(5) // top 5
				.collect(Collectors.toList());
	}
}
