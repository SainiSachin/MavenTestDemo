package Core;

public final class AppConfig {
private static AppConfig instance;
    public static AppConfig getInstance(){
        if (instance == null) {
            instance = new AppConfig();
        }

        return instance;
    }
}
