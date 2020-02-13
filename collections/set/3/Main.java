import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputLength = sc.nextInt();
    SortedSet<String> databases = new TreeSet<>();

    for (int i = 0; i <= inputLength; i++) {
      databases.add(sc.nextLine());
    }

    for (String database : databases) {
      System.out.println(database);
    }
  }
}
