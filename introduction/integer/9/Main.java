import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int group1 = sc.nextInt();
    int group2 = sc.nextInt();
    int group3 = sc.nextInt();

    int group1Desks = (group1 / 2) + group1 % 2;
    int group2Desks = (group2 / 2) + group2 % 2;
    int group3Desks = (group3 / 2) + group3 % 2;

    System.out.println(group1Desks + group2Desks + group3Desks);
  }
}
