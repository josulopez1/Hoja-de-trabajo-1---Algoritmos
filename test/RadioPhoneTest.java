import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RadioPhoneTest {

    private IRadio radio;

    @Before
    public void setUp() {
        radio = new RadioPhone();
        radio.turnOn();
    }

    @Test
    public void testTurnOn() {
        assertTrue(radio.isOn());
    }

    @Test
    public void testSwitchBand() {
        String initialBand = radio.getBand();
        radio.switchBand();
        assertNotEquals(initialBand, radio.getBand());
    }

    @Test
    public void testSaveAndSelectStation() {
        radio.nextFrequency();
        double saved = radio.getCurrentFrequency();

        radio.saveStation(1);
        radio.nextFrequency();
        radio.selectButton(1);

        assertEquals(saved, radio.getCurrentFrequency(), 0.001);
    }
}
