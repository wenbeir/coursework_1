import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dec2HexTest {
    @Test
    public void test1(){
        final String[] args = new String[]{"1"};
        Dec2Hex.main(args);
        assertEquals("1", Dec2Hex.hexadecimal);
    }
}
