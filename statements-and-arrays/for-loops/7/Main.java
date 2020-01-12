import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalParts = sc.nextInt();
    int ready = 0;
    int fixed = 0;
    int rejected = 0;

    for (int i = 1; i <= totalParts; i++) {
      int part = sc.nextInt();
      switch (part) {
        case -1:
          rejected++;
          break;
        case 0:
          ready++;
          break;
        case 1:
          fixed++;
          break;
      }
    }

    System.out.println(ready + " " + fixed + " " + rejected);
  }
}
