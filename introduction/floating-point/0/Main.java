import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int distance = sc.nextInt();
    int time = sc.nextInt();

    float speed = (float) distance / time;

    System.out.println(speed);
  }
}
