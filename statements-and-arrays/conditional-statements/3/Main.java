import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNum = sc.nextInt();
    int num = inputNum;
    int lastDigit;
    int sum = 0;
    int count = 0;

    while (num > 0) {
      lastDigit = num % 10;
      sum = (sum * 10) + lastDigit;
      num /= 10;
      count++;
    }

    int padding = 4 - count;
    sum *= Math.pow(10, padding);

    if (inputNum == sum) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
