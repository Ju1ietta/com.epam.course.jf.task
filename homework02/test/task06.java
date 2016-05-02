import org.junit.Test;
import task06and07.NuclearSubmarine;
import static org.junit.Assert.assertEquals;

public class task06 {
    @Test
    public void testTask06() {
        NuclearSubmarine nuclearSubmarine = new NuclearSubmarine("Sharp", 10000);

        //check run() method
        assertEquals("Engine Sharp of nuclear submarine with 10000 capacity has run!", nuclearSubmarine.run());
    }
}
