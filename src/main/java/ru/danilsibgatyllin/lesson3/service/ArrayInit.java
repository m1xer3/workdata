package ru.danilsibgatyllin.lesson3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayInit {

    public static List<Integer> arrInit(Integer size){
        Random random = new Random();
        List<Integer> arrOut = new ArrayList<>();

        int num=1;
        int outNum = random.nextInt(size)+1;
        for (int i=0 ; i<size;i++){
            if(outNum!=num){
                arrOut.add(num);
            }
            num++;
        }
        return arrOut;
    }

}
