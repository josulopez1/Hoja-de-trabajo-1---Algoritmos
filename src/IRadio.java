public interface IRadio {

    void turnOn();
    void turnOff();
    boolean isOn();

    void switchBand();
    String getBand();

    void nextFrequency();
    double getCurrentFrequency();

    void saveStation(int button);
    void selectButton(int button);
    double getButtonFrequency(int button);
}
