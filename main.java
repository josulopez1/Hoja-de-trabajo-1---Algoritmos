public class Main {
    public static void main(String[] args) {

        Radio radio = new RadioPhone(); 

        radio.powerOn();
        radio.switchBand();
        radio.nextStation();
        radio.saveStation(1);
        radio.selectStation(1);

        System.out.println("Band: " + radio.getBand());
        System.out.println("Station: " + radio.getStation());
    }
}
