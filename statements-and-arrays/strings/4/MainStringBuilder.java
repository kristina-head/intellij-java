import java.util.Scanner;

public class MainStringBuilder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String sequence = sc.nextLine();
    int length = sequence.length();
    char letter = sequence.charAt(0);
    int count = 1;
    StringBuilder encodedSequence = new StringBuilder();

    for (int i = 1; i < length; i++) {
      if (sequence.charAt(i) == letter) {
        count++;
      } else {
        encodedSequence.append(letter).append(count);
        letter = sequence.charAt(i);
        count = 1;
      }
    }
    encodedSequence.append(letter).append(count);

    System.out.println(encodedSequence);
  }
}
