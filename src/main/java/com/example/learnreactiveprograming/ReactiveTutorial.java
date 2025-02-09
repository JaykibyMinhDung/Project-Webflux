package com.example.learnreactiveprograming;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Locale;

public class ReactiveTutorial {
    private Mono<String> testMono() {
        return Mono.just("Java")
                .log();
    }

    private Flux<String> testFlux() {
        List<String> programmingLanguage = List.of("Java", "Python", "C++", "C#");
//        return Flux.just("Java for api backend")
//                .log();
        return Flux.fromIterable(programmingLanguage)
                .log();
    }

    private Flux<String> testMap() {
        Flux<String> flux = Flux.just("Java", "Python", "C++", "C#");
//        return Flux.just("Java for api backend")
//                .log();
        return flux.map(s -> s.toUpperCase(Locale.ROOT));
    }

    public static void main(String[] args) {
        ReactiveTutorial reactiveTutorial = new ReactiveTutorial();
//        reactiveTutorial.testMono().subscribe(data -> System.out.println("Data2132132132: " + data));
//        reactiveTutorial.testFlux().subscribe(System.out::println);
        reactiveTutorial.testMap().subscribe(System.out::println);
    }
}
