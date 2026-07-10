import java.util.Stack;

/*
YouTube: Step-by-step explanation of the solution.
https://www.youtube.com/watch?v=OikGvj2jV5E

Medium (TR): Detailed explanation of the solution using a Stack.
https://medium.com/@edakas/leetcode-20-valid-parentheses-probleminin-javada-stack-kullan%C4%B1larak-%C3%A7%C3%B6z%C3%BCm%C3%BC-c0fa278335a9
 */

public class Solution {

    public boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            } else if(c == '[') {
                stack.push(']');
            } else if(c == '{') {
                stack.push('}');
            } else {
                if(stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("{[]}"));
    }
}