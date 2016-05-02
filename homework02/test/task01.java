import org.junit.Test;
import task01.Colour;
import task01.Pen;
import task01.Type;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class task01 {
    @Test
    public void testTask01() {
        Pen ballpointPen = new Pen(Colour.BLACK, Type.BALLPOINT, 100, "Spb");
        Pen fountainPen = new Pen(Colour.RED, Type.FOUNTAIN, 100, "Moscow");
        Pen felt_tipPen = new Pen(Colour.GREEN, Type.FELT_TIP, 100, "London");
        Pen ballpointPen2 = new Pen(Colour.BLACK, Type.BALLPOINT, 100, "Spb");

        //check equals method
        assertFalse("Are equal ballpointPen to fountainPen? - ", ballpointPen.equals(fountainPen));
        assertTrue("Are equal ballpointPen to ballpointPen2? - ", ballpointPen.equals(ballpointPen2));
        assertTrue("Check the reflexive property. Is equal felt_tipPen to itself? - ", felt_tipPen.equals(felt_tipPen));
        assertTrue("Check the symmetric property: ", (ballpointPen.equals(ballpointPen2) == ballpointPen2.equals(ballpointPen)));

        //check hashCode() method
        assertTrue("HashCode of ballpointPen equals to ballpointPen2", ballpointPen.hashCode() == ballpointPen2.hashCode());

        //check toString() method
        assertEquals("ToString of felt_tipPen: ", "colourInk = GREEN; type = FELT_TIP; price = 100; producer = London", felt_tipPen.toString());
    }
}
