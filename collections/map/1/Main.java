import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    SortedMap<String, Integer> map = new TreeMap<>();
    map.put("Gamma",  3);
    map.put("Omega", 24);
    map.put("Alpha",  1);

    for (SortedMap.Entry<String, Integer> letter : map.entrySet()) {
      System.out.println(letter.getKey() + "=" + letter.getValue());
    }
  }
}
