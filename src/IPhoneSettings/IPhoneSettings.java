package IPhoneSettings;

import java.util.List;

public class IPhoneSettings {
    private static IPhoneSettings instance;
//    private List<String> settings;
    private int brightness;
    private boolean enableWiFi;
    private int fontSize;

    public IPhoneSettings() {
         this.brightness = brightness;
        this.enableWiFi = enableWiFi;
        this.fontSize = fontSize;
    }

//    public IPhoneSettings(List<String> settings, int brightness, boolean enableWiFi, int fontSize) {
//        this.settings = settings;
//        this.brightness = brightness;
//        this.enableWiFi = enableWiFi;
//        this.fontSize = fontSize;
//   }

    public static IPhoneSettings getInstance() {

        if (instance == null) {
            instance = new IPhoneSettings();
        }
        return instance;
    }


//    public List<String> getSettings() {
//        return settings;
//    }
//
//    public void setSettings(List<String> settings) {
//        this.settings = settings;
//    }


    public int getBrightness() {
        return brightness;
    }


    public void setBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = 0;
        } else if (brightness > 100) {
            this.brightness = 100;
        } else {
            this.brightness = brightness;
        }
    }


    public boolean getEnableWiFi() {
        return enableWiFi;
    }

    public void setEnableWiFi(boolean enableWiFi) {
        this.enableWiFi = enableWiFi;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 30) {
            this.fontSize = 30;
        } else {
            this.fontSize = fontSize;
        }
    }
}


