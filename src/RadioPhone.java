public class RadioPhone implements IRadio {

    private boolean isOn;
    private boolean isFM = true;

    private double currentAM = 1030.0;
    private double currentFM = 88.5;

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

    @Override
    public void switchBand() {
        if (!isOn) return;
        isFM = !isFM;
    }

    @Override
    public String getBand() {
        return isFM ? "FM" : "AM";
    }

    @Override
    public void nextFrequency() {
        if (!isOn) return;

        if (isFM) {
            currentFM += 0.2;
            if (currentFM > 107.9) currentFM = 87.9;
        } else {
            currentAM += 10;
            if (currentAM > 1610) currentAM = 530;
        }
    }

    @Override
    public double getCurrentFrequency() {
        return isFM ? currentFM : currentAM;
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

