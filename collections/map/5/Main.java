import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int from = sc.nextInt();
    int to = sc.nextInt() + 1;
    int totalPairs = sc.nextInt();
    SortedMap<Integer, String> pairs = new TreeMap<>();

    for (int i = 0; i < totalPairs; i++) {
      pairs.put(sc.nextInt(), sc.next());
    }

    for (Map.Entry<Integer, String> pair : pairs.subMap(from, to).entrySet()) {
      System.out.println(pair.getKey() + " " + pair.getValue());
    }
  }
}
