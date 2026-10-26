/**
 * EquationReverser.java
 * Your Name:       Yıldız Karamahmut
 * Your Student ID: 240444039
 * Your Date:       26/10/2026
 */
public class EquationReverser {
    public static String reverseEquation(String equation) {
        TokenStack stack = new TokenStack();
        int i = 0;
        int n = equation.length();
        // Traverse the equation from left to right.
        while (i < n) {
            char current = equation.charAt(i);
            // If the current character is a digit, extract the entire number.
            if (Character.isDigit(current)) {
                int start = i;
                while (i < n && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                stack.push(equation.substring(start, i));
            } else {
                // Otherwise, push the operator.
                stack.push(String.valueOf(current));
                i++;
            }
        }
        // Pop all items from the stack and append them to a StringBuilder.
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
