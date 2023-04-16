package com.greenfoxacademy.reddit.useful_methods;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//@SpringBootApplication
public class Streams {

    public static void main(String[] args) {
//        Write a method to return a list of even numbers from the list of integers below using the Stream API.

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        System.out.println(evens(numbers));
        List<Integer> expectedOutput = Arrays.asList(-2, -4, -8, 12, 6, 10, 14);


//        Write a method to return a list of squares of positive numbers from the list of integers
//        below using the Stream API.

//        System.out.println(positiveSquares(numbers));

//        Write a method to return a list of numbers whose square is greater than 20
//        from the list of integers below using the Stream API. The value 20 should be one of the method's parameters.

        numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        System.out.println(biggerSquares(numbers, 20));

//        Write a method to return the average of odd numbers in the list of integers below using the Stream API.
//        Implement this without calculating the sum first!

        numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        System.out.println(averageOfOdds(numbers));
        double expectedOutput4 = 32.0/6.0;


        // Write a method to return the sum of odd numbers in the list of integers below using the Stream API.
        numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        System.out.println(sum(numbers));
        double expectedOutput5 = 61;


        // Write a method to return a list of uppercase characters from a given string using the Stream API.
        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";
        System.out.println(upChars(s));
        List<Character> expectedOutput6 = Arrays.asList('L', 'I', 'D', 'S', 'A', 'C', 'A', 'E', 'M');




    }


    // Task One: List of evens
    public static List<Integer> evens(List<Integer> ints) {
        List<Integer> expectedOutput = new ArrayList<>();
        ints.stream()
                .filter(s -> s % 2 == 0)
                .forEach(s -> expectedOutput.add(s));
        return expectedOutput;
    }

    // Task Two: List of positive squeres
    public static List<Integer> positiveSquares(List<Integer> ints) {
        List<Integer> expectedOutput = new ArrayList<>();
        ints.stream()
                .filter(s -> s >= 0)
                .map(s -> s * s)
                .forEach(s -> expectedOutput.add(s));
        return expectedOutput;
    }

    // Task Three: List elements' square bigger then given number
    public static List<Integer> biggerSquares(List<Integer> ints, int value) {
        List<Integer> expectedOutput = new ArrayList<>();
        ints.stream()
                .filter(s -> s * s > value)
                .forEach(s -> expectedOutput.add(s * s));
        return expectedOutput;
    }

    // Task Four: Average of odd numbers in a list
    public static double averageOfOdds(List<Integer> ints) {

        return ints.stream()
                .filter(s -> s % 2 == 1)
                .mapToDouble(s -> s)
                .average()
                .orElse(Double.NaN);
    }


    // Task Five: sum.
    public static int sum(List<Integer> ints) {
        return ints.stream()
                .filter(s -> s % 2 == 1)
                .mapToInt(s -> s).sum();
    }

    // Task Six: uppercase characters
    public static List<Character> upChars(String str){
        List<Character> chars = new ArrayList<>();
        IntStream streamOfChars = str.chars();
        streamOfChars
                .filter(s -> s > 64)
                .filter(s -> s < 91)
                .forEach(s -> chars.add((char)s));
        return chars;
    }







}
