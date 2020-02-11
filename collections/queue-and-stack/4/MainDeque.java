import java.util.ArrayDeque;
import java.util.Scanner;

public class MainDeque {
  public static void main(String[] args) {
    ArrayDeque<Character> brackets = new ArrayDeque<>();
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') {
        brackets.push(input.charAt(i));
      } else if (!brackets.isEmpty() && ((input.charAt(i) == ']' && brackets.peek() == '[') ||
              (input.charAt(i) == '}' && brackets.peek() == '{') ||
              (input.charAt(i) == ')' && brackets.peek() == '('))) {
        brackets.pop();
      } else {
        brackets.push(input.charAt(i));
      }
    }
    if (brackets.isEmpty()){
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
