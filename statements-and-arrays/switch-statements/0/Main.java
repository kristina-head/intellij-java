import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int shape = sc.nextInt();
    String sentence = "You have chosen a ";

    switch (shape) {
      case 1:
        System.out.println(sentence + "square");
        break;
      case 2:
        System.out.println(sentence + "circle");
        break;
      case 3:
        System.out.println(sentence + "triangle");
        break;
      case 4:
        System.out.println(sentence + "rhombus");
        break;
      default:
        System.out.println("There is no such shape!");
    }
  }
}
