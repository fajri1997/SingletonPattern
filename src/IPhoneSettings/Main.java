package IPhoneSettings;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IPhoneSettings settings = IPhoneSettings.getInstance();

        settings.setBrightness(85);
        settings.setFontSize(18);
        settings.setEnableWiFi(true);

        System.out.println("Brightness: " + settings.getBrightness());
        System.out.println("Font Size: " + settings.getFontSize());
        System.out.println("WiFi Enabled: " + settings.getEnableWiFi());


    }
}