package ru.danilsibgatyllin.lesson2.services;

import ru.danilsibgatyllin.lesson2.models.Brand;
import ru.danilsibgatyllin.lesson2.models.Notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayInitService{

    private Integer elementCount;
    private Integer max;
    private Integer min;
    private Integer step;

    public ArrayInitService(Integer elementCount, Integer max, Integer min, Integer step) {
        this.elementCount = elementCount;
        this.max = max;
        this.min = min;
        this.step=step;
    }

    public List<Notebook> init() {
        List<Notebook> array = new ArrayList<>();
        Random randomizer = new Random();

        for (int i=0; i<=elementCount; i++) {
            int randomNumber = randomizer.nextInt(4);
            Brand brand= Brand.ASOS;
            switch(randomNumber) {
                case 0:
                    brand = Brand.LENUVO;
                    break;
                case 1:
                    brand = Brand.ASOS;
                    break;
                case 2:
                    brand = Brand.MACNOTE;
                    break;
                case 3:
                    brand = Brand.ESER;
                    break;
                case 4:
                    brand = Brand.XAMIOU;
                    break;
            }
            array.add(new Notebook(brand,randomizer.nextInt((((max - min) + 1) + min)/step)*step,randomizer.nextInt((((24 - 4) + 1) + 4)/4)*4));
        }
        return array;
    }




}
