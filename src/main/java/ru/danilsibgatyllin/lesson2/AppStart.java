package ru.danilsibgatyllin.lesson2;

import ru.danilsibgatyllin.lesson2.models.Notebook;
import ru.danilsibgatyllin.lesson2.services.ArrayInitService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AppStart {
    public static void main(String[] args) {
        ArrayInitService arrayInitService = new ArrayInitService(10000, 2000, 500,50);
        List<Notebook> array = arrayInitService.init();
        Collections.sort(array);
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println("End");
    }
}
