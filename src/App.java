import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    try (Scanner startInput = new Scanner(System.in)) {
      System.out.println("Você quer começar sua pirâmide com qual número?");
      int firstNum = Integer.parseInt(startInput.nextLine());

      try (Scanner endInput = new Scanner(System.in)) {
        System.out.println("Você quer que a sua pirâmide termine em qual número?");
        int secondNum = Integer.parseInt(endInput.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
          StringBuilder printLine = new StringBuilder();
          for (int j = 1; j <= i; j++) {
            printLine.append(i);
          }
          System.out.println(printLine.toString());
        }
      }
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }

  }
}
