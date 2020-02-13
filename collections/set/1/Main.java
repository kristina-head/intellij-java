import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

    for (String name : nameSet) {
      System.out.println(name);
    }
  }
}
