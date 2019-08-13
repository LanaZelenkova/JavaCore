package edu.pht.lessoncollections.util.fileutil;

import java.util.ResourceBundle;

public class FileReader {
    private static FileReader instance;
    public ResourceBundle resourceBundle;

    public static final String BUNDLE_NAME = "info";
    public static final String FILE_INFO_PROPERTY = "key";

    public static FileReader getInstance() {
        if (instance == null) {
            instance = new FileReader();
        }
        instance.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);
        System.out.println(instance.resourceBundle.keySet().size());
        return instance;
    }

    public String getProperty(String k) {
        return resourceBundle.getString(k);
    }

    public int getSize() {
        return resourceBundle.keySet().size();
    }
}

