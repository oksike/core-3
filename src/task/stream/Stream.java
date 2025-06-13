package task.stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {
//задание 1
  public static int addNumbers(int num1, int num2) {
    return num1+num2;
  }
  //задание 2
  public static List<String> filterWordsByLetter(List<String> words, char letter) {
    Predicate<String> predicate1 = firstL -> firstL.charAt(0) == letter;
    return words.stream()
            .filter(predicate1)
            .collect(Collectors.toList());
  }
  // задание 3
  public static List<Integer> squareNumbers(List<Integer> numbers) {
    Function<Integer, Integer> squareF = x-> x*x;
    return numbers.stream()
            .map(squareF)
            .collect(Collectors.toList());
  }
  // задание 4
  public static void printUpperCase(List<String> words) {
    Consumer<String> UppCase = wordUpp -> wordUpp.toUpperCase();
  }
// задание 5
  public static int sumOfNumbers(List<Integer> numbers) {
    return numbers.stream()
            .reduce(0,Integer::sum);
  }
//задание 6
  public static OptionalDouble averageOfNumbers(List<Integer> numbers) {
    return numbers.stream()
            .mapToInt(Integer::intValue)
            .average();
  }

  public static Optional<Integer> findMaxNumber(List<Integer> numbers) {
    return numbers.stream()
            .max(Integer::compareTo);

  }

  public static Optional<Integer> findMinNumber(List<Integer> numbers) {
    return numbers.stream()
            .min(Integer::compareTo);
  }

  public static boolean containsValue(List<Integer> numbers, int value) {
    return numbers.stream()
            .anyMatch(chekEl->chekEl.equals(value));
  }

  public static List<Integer> removeDuplicates(List<Integer> numbers) {
    return numbers.stream()
            .distinct()
            .collect(Collectors.toList());
  }

  public static List<Integer> stringLengths(List<String> words) {
    return words.stream()
            .map(String::length)
            .collect(Collectors.toList());
  }

  public static String concatenateStrings(List<String> words) {
    return words.stream()
            .map(String::trim)
            .collect(Collectors.joining(" "));

  }

  public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
    return numbers.stream()
            .filter(x->x%2==0)
            .collect(Collectors.toList());
  }

  public static Optional<Integer> findFirstEvenNumber(List<Integer> numbers) {
    return numbers.stream()
            .filter(x->x%2==0)
            .findFirst();
  }

}