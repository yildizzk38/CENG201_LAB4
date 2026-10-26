/**

 * BalancedBrackets.java
 * Your Name:       Yıldız Karamahmut
 * Your Student ID: 240444039
 * Your Date:       26/10/2026

 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        BracketStack stack = new BracketStack();

        // 1. Traverse the string character by character.

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // 2. If the character is an opening bracket, push it onto the stack.

            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            }

            // 3. If it is a closing bracket:

            else if (ch == ')' || ch == '}' || ch == ']') {

                // Check whether the stack is empty.

                if (stack.isEmpty()) {

                    return false;

                }

                // Pop the top opening bracket and check whether the brackets match.

                char openBracket = stack.pop();

                if (!isMatchingPair(openBracket, ch)) {

                    return false;

                }

            }

        }

        // 4. At the end, check whether the stack is empty.

        return stack.isEmpty();

    }

    private static boolean isMatchingPair(char opening, char closing) {

        if (opening == '(' && closing == ')') return true;

        if (opening == '[' && closing == ']') return true;

        if (opening == '{' && closing == '}') return true;

        return false;

    }

}

