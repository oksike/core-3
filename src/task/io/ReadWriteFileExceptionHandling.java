package task.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadWriteFileExceptionHandling {

  public static void createAndWriteFile(String fileName, String content) {
      try {
        Path filePath = Paths.get(fileName);
        Files.write(filePath, content.getBytes());
      } catch (IOException e) {

      }
  }

  public static void createFileFromConsoleInput() {
    Scanner scanner = new Scanner(System.in);
    String fileName = scanner.nextLine();
    String content = scanner.nextLine();
    try {
      Path filePath = Paths.get(fileName);
      Files.write(filePath, content.getBytes());
    } catch (IOException e){

    }
  }

  public static double divideNumbers(double a, double b) {
    if (b==0) {
      throw new ArithmeticException("ошибка");
    }
    return a/b;
  }

  public static void readNumberAndPrintSquare() {
    Scanner scanner = new Scanner(System.in);
    Double number = scanner.nextDouble();
    try {
      double square = number*number;
      System.out.println(square);
    } catch (ArithmeticException e) {

    }

  }

  public static void readFileAndPrint(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        System.out.println(line);}
    } catch (IOException e){ }
  }

  public static int convertStringToNumber(String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e){
      throw new NumberFormatException("error");
    }

  }

  public static void divideConsoleInput() {
    Scanner scanner = new Scanner(System.in);
    Double number1 = scanner.nextDouble();
    Double number2 = scanner.nextDouble();
    try {
      double res = number1/number2;
      System.out.println(res);
    } catch (ArithmeticException e){}

  }

  public static void createFileAndReadFirstWord(String fileName, String content) {
    try {
      Path filePath = Paths.get(fileName);
      Files.write(filePath, content.getBytes());
      String fileContent = new String(Files.readAllBytes(filePath));
      String[] words = fileContent.split("//");
      System.out.println(words[0]);
    } catch (IOException e) {

    }

  }

  public static void main(String[] args) {
    createFileFromConsoleInput();
    readNumberAndPrintSquare();
    divideConsoleInput();
    createFileAndReadFirstWord("test.txt", "Hello world");
  }
}