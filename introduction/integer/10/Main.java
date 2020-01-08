public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pole = sc.nextInt();
    int up = sc.nextInt();
    int down = sc.nextInt();
    int sum = 0;
    int days = 0;

    while (sum < pole) {
      sum += up;
      days++;
      if (sum >= pole) {
        break;
      }
      sum -= down;
    }

    System.out.println(days);
  }
}
