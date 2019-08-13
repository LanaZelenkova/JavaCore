package edu.pht.lessoncollections.run;

import edu.pht.lessoncollections.util.fileutil.FileReader;
import edu.pht.lessoncollections.util.fileutil.FileUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
    public static final String DELIMITER = ":";
    public static final String COLON = " : ";
    public static void main(String[] args) {
        FileReader fileReader = FileReader.getInstance();
        Map<String, Integer> map = new HashMap<>();
        int size = fileReader.getSize();
        String key;
        String[] data;
        for (int i = 0; i < size; i++) {
            key = "key" + i;
            data = fileReader.getProperty(key).split(DELIMITER);
            map.put( data[0], Integer.parseInt(data[1]));
        }
        FileUtil.printMap(map);
        System.out.println("_________________________________________________________________________________________");
        FileUtil.removeIf(map);
        //removeFromMapIfNullValue(map);
        FileUtil.printMap(map);
        System.out.println("_________________________________________________________________________________________");
        String keyForMaxValue = FileUtil.getCategoryWithMaxValue(map);
        System.out.println("Max value " + map.get(keyForMaxValue) + " in category \"" + keyForMaxValue + "\"");
        System.out.println("_________________________________________________________________________________________");
        FileUtil.sortMapValues(map);
    }
}
