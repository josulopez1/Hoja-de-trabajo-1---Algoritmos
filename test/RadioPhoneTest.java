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
        String band = radio.getBand();
        radio.switchBand();
        assertNotEquals(band, radio.getBand());
    }

    @Test
    public void testSaveAndSelectPreset() {
        radio.nextFrequency();
        double freq = radio.getCurrentFrequency();

        radio.saveStation(1);
        radio.nextFrequency();
        radio.selectButton(1);

        assertEquals(freq, radio.getCurrentFrequency(), 0.001);
    }
}

