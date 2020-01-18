import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String sequence = sc.nextLine();
    int length = sequence.length();
    char letter = sequence.charAt(0);
    int count = 1;
    String encodedSequence = "";

    for (int i = 1; i < length; i++) {
      if (sequence.charAt(i) == letter) {
        count++;
      } else {
        encodedSequence += letter + String.valueOf(count);
        letter = sequence.charAt(i);
        count = 1;
      }
    }
    encodedSequence += letter + String.valueOf(count);

    System.out.println(encodedSequence);
  }
}
