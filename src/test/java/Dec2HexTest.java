import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Dec2HexTest {
    @Test
    public void Test1() {
        final String[] args = new String[]{"15"};
        Dec2Hex.main(args);
        assertEquals("F", Dec2Hex.Arg1);
    }
}
