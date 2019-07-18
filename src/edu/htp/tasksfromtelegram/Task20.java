package edu.htp.tasksfromtelegram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task20 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        List<Integer> listNext = new ArrayList<>();
        Collections.addAll(listNext, array);
    }
}