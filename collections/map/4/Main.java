import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] original = sc.nextLine().toCharArray();
    char[] cipher = sc.nextLine().toCharArray();

    Map<Character, Character> encode = new HashMap<>();
    Map<Character, Character> decode = new HashMap<>();

    for (int i = 0; i < original.length; i++) {
      encode.put(original[i], cipher[i]);
      decode.put(cipher[i], original[i]);
    }

    original = sc.nextLine().toCharArray();
    cipher = sc.nextLine().toCharArray();
    
    for (char letter : original) {
      System.out.print(encode.get(letter));
    }
    System.out.println();
    for (char symbol : cipher) {
      System.out.print(decode.get(symbol));
    }
  }
}
