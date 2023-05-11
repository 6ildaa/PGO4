import java.math.BigDecimal;
import java.util.List;


class Adder {

    public int add(int a, int b) {
        return a + b;
    }

    public BigDecimal add(List<BigDecimal> numbers) {
        BigDecimal result = BigDecimal.ZERO;
        for (BigDecimal number : numbers) {
            result = result.add(number);
        }
        return result;
    }






}
