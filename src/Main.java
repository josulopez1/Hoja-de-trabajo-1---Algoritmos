public class Main {
    public static void main(String[] args) {

        IRadio radio = new RadioPhone();

        radio.turnOn();
        radio.switchBand();
        radio.nextFrequency();

        System.out.println("Band: " + radio.getBand());
        System.out.println("Station: " + radio.getCurrentFrequency());
    }
}

