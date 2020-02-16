import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int totalWords = sc.nextInt();
    Map<String, Boolean> dictionary = new HashMap<>();
    for (int i = 0; i < totalWords; i++) {
      dictionary.put(sc.next().toLowerCase(), false);
    }

    int totalLines = sc.nextInt();
    Map<String, Boolean> invalidWords = new HashMap<>();
    for (int i = 0; i <= totalLines; i++) {
      String[] sentence = sc.nextLine().toLowerCase().split(" ");
      for (String word : sentence) {
        if (!dictionary.containsKey(word)) {
          invalidWords.put(word, false);
        }
      }
    }

    for (Map.Entry<String, Boolean> word : invalidWords.entrySet()) {
      System.out.println(word.getKey());
    }
  }
}
