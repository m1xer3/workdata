package ru.danilsibgatyllin.lesson3.service;

import java.util.List;

public class ArrayService {

    public static Integer findMisNum(List<Integer> arr){
        Integer miss = 1;
        for (Integer num : arr) {
            if (!num.equals(miss)) break;
            miss++;
        }
        return miss;
    }
}
