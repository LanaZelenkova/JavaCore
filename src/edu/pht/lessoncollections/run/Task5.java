package edu.pht.lessoncollections.run;

import edu.pht.lessoncollections.util.fileutil.FileReader;

public class Task5 {
    public static void main(String[] args) {
        FileReader pageReader = FileReader.getInstance();
        System.out.println(pageReader.getProperty(FileReader.FILE_INFO_PROPERTY));
    }
}
