package edu.pht.lessoncollections.util.fileutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static edu.pht.lessoncollections.run.Task5.COLON;

public class FileUtil {
    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + COLON + entry.getValue());
        }
    }

    public static void removeIf(Map<String, Integer> map) {
        map.values().removeIf(m -> m == 0);
    }

    public static void removeFromMapIfNullValue(Map<String, Integer> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                result.add(entry.getKey());
            }
        }
        for (String key : result) {
            map.remove(key);
        }
    }

    public static String getCategoryWithMaxValue(Map<String, Integer> map) {
        String result = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    public static void sortMapValues(Map<String, Integer> map) {
        Collection<Integer> values = map.values();
        int n = values.size();
        Integer[] listOfValues = new Integer[n];
        values.toArray(listOfValues);
        if (n != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n - i; j++) {
                    if (listOfValues[j - 1] > listOfValues[j]) {
                        int temp = listOfValues[j - 1];
                        listOfValues[j - 1] = listOfValues[j];
                        listOfValues[j] = temp;
                    }
                }
            }
            for (int intValue : listOfValues) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == intValue) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }
            }
        } else {
            System.out.println("Collection do not have category with non-null quantity");
        }
    }
}
