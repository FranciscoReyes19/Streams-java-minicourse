package com.course;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        //1. Integer Stream
            /*IntStream
                    .range(1, 10)
                    .forEach(System.out::print);
            System.out.println();*/

        //2. Integer Stream with skipt
            /*IntStream
                    .range(1, 10)
                    .skip(5)
                    .forEach(x -> System.out.println(x));*/

        //3. Integer Stream with sum
            /*System.out.println(
                    IntStream
                    .range(1,5)
                    .sum()
            );*/

        //4. Stream.of, sorted and findFirst
            /*Stream.of("Java", "Fran", "Juan")
                    .sorted()
                    .findFirst()
                    .ifPresent(x -> System.out.println(x));*/

        //5. Stream from Array, sort, filter and print
            /*String[] names = {"Juan", "Pedro", "Sofia", "Andres", "Fran", "Karin", "Gabriel", "Fernando"};

            Arrays.stream(names)
                    .filter(x -> x.startsWith("F"))
                    .sorted()
                    .forEach(x -> System.out.println(x));*/

        //6. Average of squares of an int arrays
            /*Arrays.stream(new int[] {2,4,6,8,10})
                    .map(x -> x * x)
                    .average()
                    .ifPresent(x -> System.out.println(x));*/

        //7. Stream from List, filter and print
        /*List<String> people = Arrays.asList("Juan", "Pedro", "Sofia", "Andres", "Fran", "Karin", "Gabriel", "Fernando");

        //.map([class]:: [name of function])

        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(x -> System.out.println(x));*/

        //8. Stream rows from text, file, sort, filter and print

            /*Stream<String> bands = Files.lines(Paths.get("c://bandas.txt"));

            bands
                    .sorted()
                    .filter(x-> x.length() > 13)
                    .forEach(System.out:: println);
            bands.close();*/

        //9. Stream rows from text file and save to List
            /*List<String> band2 = Files.lines(Paths.get("c://bandas.txt"))
                    .filter(x-> x.contains("Reyes"))
                    .collect(Collectors.toList());

            band2.forEach(x -> System.out.println(x));*/

        //10. Stream rows from CSV file and count

        Stream<String> rows1 = Files.lines(Paths.get("c://data.txt"));

        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x-> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();

    }
}
