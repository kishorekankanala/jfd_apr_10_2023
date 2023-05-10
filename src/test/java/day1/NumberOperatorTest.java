package day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOperatorTest {
    @Test
    void biggestAsFirstNumber(){
        NumberOperator obj = new NumberOperator();
        int actual =obj.biggest(30,20,10);
        int expected = 30;
        Assertions.assertEquals(expected, actual);
    }
}
