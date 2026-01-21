public interface Radio {

    void powerOn();
    void powerOff();
    boolean isOn();

    void switchBand();
    String getBand();

    void nextStation();
    double getStation();

    void saveStation(int button);
    void selectStation(int button);
}
