import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String ticketNumbers = sc.nextLine();
    int length = ticketNumbers.length();
    int firstHalf = 0;
    int secondHalf = 0;

    for (int i = 0; i < length; i++) {
      if (i < 3) {
        firstHalf += ticketNumbers.charAt(i);
      } else {
        secondHalf += ticketNumbers.charAt(i);
      }
    }

    String ticketType;

    if (firstHalf == secondHalf) {
      ticketType = "Lucky";
    } else {
      ticketType = "Regular";
    }

    System.out.println(ticketType);
  }
}
