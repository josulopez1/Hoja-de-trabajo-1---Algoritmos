public class RadioPhone implements IRadio {

    private boolean isOn;
    private boolean isFM = true;

    private double currentAM = 1030.0;
    private double currentFM = 88.5;

    private double[] amPresets = new double[12];
    private double[] fmPresets = new double[12];

    public RadioPhone() {
        for (int i = 0; i < 12; i++) {
            amPresets[i] = 1030.0;
            fmPresets[i] = 88.5;
        }
    }

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
    public void saveStation(int button) {
        if (!isOn || button < 1 || button > 12) return;

        if (isFM) {
            fmPresets[button - 1] = currentFM;
        } else {
            amPresets[button - 1] = currentAM;
        }
    }

    @Override
    public void selectButton(int button) {
        if (!isOn || button < 1 || button > 12) return;

        if (isFM) {
            currentFM = fmPresets[button - 1];
        } else {
            currentAM = amPresets[button - 1];
        }
    }

    @Override
    public double getButtonFrequency(int button) {
        if (button < 1 || button > 12) return 0.0;
        return isFM ? fmPresets[button - 1] : amPresets[button - 1];
    }
}

