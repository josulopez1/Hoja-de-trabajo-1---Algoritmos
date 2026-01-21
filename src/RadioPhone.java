public class RadioPhone implements IRadio {

    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    // ---- Métodos pendientes ----

    @Override
    public void switchBand() {}

    @Override
    public String getBand() {
        return "";
    }

    @Override
    public void nextFrequency() {}

    @Override
    public double getCurrentFrequency() {
        return 0.0;
    }

    @Override
    public void saveStation(int button) {}

    @Override
    public void selectButton(int button) {}

    @Override
    public double getButtonFrequency(int button) {
        return 0.0;
    }
}
