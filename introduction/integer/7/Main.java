import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int startH = sc.nextInt();
    int startM = sc.nextInt();
    int startS = sc.nextInt();
    int endH = sc.nextInt();
    int endM = sc.nextInt();
    int endS = sc.nextInt();

    int hoursDiff = endH - startH;
    int minutesDiff = endM - startM;
    int secondsDiff = endS - startS;

    int hoursAsSeconds = hoursDiff * 3600;
    int minutesAsSeconds = minutesDiff * 60;

    System.out.println(hoursAsSeconds + minutesAsSeconds + secondsDiff);
  }
}
