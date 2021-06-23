package pages;

import org.aeonbits.owner.ConfigFactory;

public class PropertyHelper {

    private static pages.AppConfig config;

    public static pages.AppConfig getConf() {
        if (config == null) {
            config = ConfigFactory.create(pages.AppConfig.class);
        }
        return config;
    }
}