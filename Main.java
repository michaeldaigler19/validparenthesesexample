import java.util.Scanner;
import java.util.Stack;

public class Main {

    // (())
    public static boolean valid(char[] charrArr, Stack<Character> s) {
        for(char c : charrArr) {
            if( c == '(')
                s.push(')');
            else if (c == '{')
                s.push('}');
            else if (c == '[')
                s.push(']');
            else if( s.isEmpty() || s.pop() != c)
                return false;

        }
        return s.isEmpty() ;
    }

    public static void main(String args[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charrArr = new char[input.length()];
        for(int i = 0; i< input.length();i++) {
            charrArr[i] = input.charAt(i);
        }
        boolean valid = valid(charrArr, s);
        System.out.println(valid);

    }
}
