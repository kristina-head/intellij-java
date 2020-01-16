import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String sentence = sc.nextLine();
    String[] words = sentence.split(" ");
    int length = words.length;
    String biggestWord = "";
    int biggestWordLength = 0;

    for (int i = 0; i < length; i++) {
      if (biggestWordLength < words[i].length()) {
        biggestWordLength = words[i].length();
        biggestWord = words[i];
      }
    }

    System.out.println(biggestWord);
  }
}
