package exercise2;

/**
 * EquationReverser.java
 *
 * Your Name:        Ferzan
 * Your Student ID:  240444049
 * Your Date:        28.10.2026
 */

public class EquationReverser {

    // Note: The method is static so it can be called directly using the class name (EquationReverser.reverseEquation(...))
    // without needing to instantiate an object of EquationReverser.
    public static String reverseEquation(String equation) {
        TokenStack stack = new TokenStack();
        int i = 0;

        // TODO 1: Traverse the equation from left to right.
        while (i < equation.length()) {
            char current = equation.charAt(i);

            // TODO 2: If the current character is a digit,
            //         remember the start index and move forward until the number ends.
            if (Character.isDigit(current)) {
                int start = i;
                while (i < equation.length() && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                String number = equation.substring(start, i);
                stack.push(number);
            }
            // TODO 3: Otherwise, push the operator.
            else {
                stack.push(String.valueOf(current));
                i++;
            }
        }

        // TODO 4: Pop all items from the stack and append them to a StringBuilder.
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}