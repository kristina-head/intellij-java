import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] sentence = sc.nextLine().toLowerCase().split(" ");
    Map<String, Integer> wordCount = new HashMap<>();

    for (String word : sentence) {
      if (!wordCount.containsKey(word)) {
        wordCount.put(word, 1);
      } else {
        int count = wordCount.get(word);
        wordCount.replace(word, count += 1);
      }
    }

    for (Map.Entry<String, Integer> total : wordCount.entrySet()) {
      System.out.println(total.getKey() + " " + total.getValue());
    }
  }
}
