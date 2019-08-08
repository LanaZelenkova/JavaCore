package edu.pht.lessoncollections.util.fileutil;

import java.util.ResourceBundle;

public class FileReader {
    private static FileReader instance;
    private ResourceBundle resourceBundle;

    public static final String BUNDLE_NAME = "file";
    public static final String FILE_INFO_PROPERTY = "key";

    public static FileReader getInstance() {
        if (instance == null) {
            instance = new FileReader();
        }
        instance.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);
        return instance;
    }
    public String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}

