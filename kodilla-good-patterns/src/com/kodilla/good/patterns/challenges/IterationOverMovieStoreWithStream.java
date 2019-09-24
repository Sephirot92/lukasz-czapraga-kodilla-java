package com.kodilla.good.patterns.challenges;

public class IterationOverMovieStoreWithStream {
    public static void main (String [] args){
        MovieStore.getMovies().entrySet().stream()
                .flatMap(l -> l.getValue().stream())
                .forEach(s -> System.out.print(s + "!"));
    }
}
