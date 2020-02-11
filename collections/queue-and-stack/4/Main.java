import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<Character> brackets = new Stack<>();
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') {
        brackets.push(input.charAt(i));
      } else if (!brackets.empty() && ((input.charAt(i) == ']' && brackets.peek() == '[') ||
              (input.charAt(i) == '}' && brackets.peek() == '{') ||
              (input.charAt(i) == ')' && brackets.peek() == '('))) {
        brackets.pop();
      } else {
        brackets.push(input.charAt(i));
      }
    }
    if (brackets.empty()){
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
