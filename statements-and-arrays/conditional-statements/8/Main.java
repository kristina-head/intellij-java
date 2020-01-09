import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int units = sc.nextInt();
    String category;

    if (units < 1) {
      category = "no army";
    } else if (units <= 4) {
      category = "few";
    } else if (units <= 9) {
      category = "several";
    } else if (units <= 19) {
      category = "pack";
    } else if (units <= 49) {
      category = "lots";
    } else if (units <= 99) {
      category = "horde";
    } else if (units <= 249) {
      category = "throng";
    } else if (units <= 499) {
      category = "swarm";
    } else if (units <= 999) {
      category = "zounds";
    } else {
      category = "legion";
    }

    System.out.println(category);
  }
}
