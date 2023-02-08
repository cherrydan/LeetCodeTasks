import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ValidBracketsSolution {
    public static boolean isValid(String s) {
        /* Мы создаём мапу, в которой ключом является именно закрывающая скобка,
         а значением - открывающая, т.к. соответствие нужно вычислять именно для закрывающей.
         */
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (brackets.containsValue(c)) {
                // одна из открывающих скобок
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                // одна из закрывающих скобок
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
// в конце стек должен быть пустым
        return stack.isEmpty();
    }


}
