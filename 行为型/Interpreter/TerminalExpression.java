package ReadAgain.设计模式.行为型.Interpreter;

import java.util.StringTokenizer;

public class TerminalExpression extends Expression {
    private String literal = null;
    public TerminalExpression(String str) {
        literal = str;
    }

    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }

}
