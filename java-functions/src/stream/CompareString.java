package stream;

import java.util.function.BinaryOperator;

public class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s, String s2) {
        return s.length() >= s2.length() ? s : s2;
    }
}
