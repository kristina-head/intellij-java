import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainToArray {
  public static void main(String[] args) {
    List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

    String[] strArray = nameList.toArray(new String[nameList.size()]);

    for (String name : strArray) {
      System.out.println(name);
    }
  }
}
