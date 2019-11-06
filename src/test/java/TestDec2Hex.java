import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDec2Hex {
    @Test
    public void test1(){
        final String[] args = new String[]{"14"};
        Dec2Hex.main(args);
        assertEquals("E", Dec2Hex.hexadecimal);
    }
}
