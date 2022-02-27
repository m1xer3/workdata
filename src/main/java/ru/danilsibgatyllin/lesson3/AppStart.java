package ru.danilsibgatyllin.lesson3;

import ru.danilsibgatyllin.lesson3.service.ArrayInit;
import ru.danilsibgatyllin.lesson3.service.ArrayService;

import java.util.List;

public class AppStart {
    public static void main(String[] args) {

        List<Integer> arr = ArrayInit.arrInit(15);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
        System.out.println("Miss is - "+ArrayService.findMisNum(arr));

    }
}
