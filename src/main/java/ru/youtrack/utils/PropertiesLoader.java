package ru.youtrack.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    Properties properties;

    public static Properties loadProperties() throws IOException {
        File file = new File("src/test/resources/data.properties");
        Properties properties = new Properties();
        properties.load(new FileReader(file));
        return properties;
    }
}
