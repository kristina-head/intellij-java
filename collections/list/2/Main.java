import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

    String[] strArray = new String[nameList.size()];

    for (int i = 0; i < nameList.size(); i++) {
      strArray[i] = nameList.get(i);
    }

    for (String name : strArray) {
      System.out.println(name);
    }
  }
}
