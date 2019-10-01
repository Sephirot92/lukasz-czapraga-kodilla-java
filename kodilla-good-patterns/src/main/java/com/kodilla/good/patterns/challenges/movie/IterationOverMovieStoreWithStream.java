package com.kodilla.good.patterns.challenges.movie;

import java.util.stream.Collectors;

public class IterationOverMovieStoreWithStream {
    public static void main(String[] args) {
        String movieNamesSeparatedWithExclamationMark = MovieStore.getMovies().entrySet().stream()
                .flatMap(l -> l.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieNamesSeparatedWithExclamationMark);
    }
}
