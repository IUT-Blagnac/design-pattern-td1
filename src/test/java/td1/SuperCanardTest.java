package td1;

import static org.junit.Assert.assertEquals;

/**
 * @author bruel
 *
 */

import org.blagnac.cpoa.*;
import org.junit.Test;
import org.mockito.Mockito;

public class SuperCanardTest {

    @Test
    public void unCanardPeutCancaner() {
        Canard absCls = Mockito.mock(
            Canard.class, 
            Mockito.CALLS_REAL_METHODS);
        assertEquals("Je cancane!", absCls.cancaner());
    }

    @Test
    public void unColvertPeutCancaner() {
        Colvert coincoin = new Colvert();

        String expected = "Je cancane!";
        assertEquals(expected, expected, coincoin.cancaner());
    }

    @Test
    public void unColvertPeutNager() {
        Colvert coincoin = new Colvert();

        String expected = "Je nage comme un Canard!";
        assertEquals(expected, expected, coincoin.nager());
    }

    @Test
    public void unColvertEstUnColvert() {
        Colvert coincoin = new Colvert();

        String expected = "Je suis un Colvert!";
        assertEquals(expected, expected, coincoin.afficher());
    }

}
 

