package ru.danilsibgatyllin.lesson5.ex2;

import java.util.ArrayList;
import java.util.List;

public class BackpackService {

    private Backpack backpack;

    private List<Baggage> bestList;
    private Integer bestPrice;

    public BackpackService(Backpack backpack) {
        this.backpack=backpack;
        this.bestList=new ArrayList<>();
    }

    public List<Baggage> getOptimalSet (List<Baggage> currentList){
        findOptimalStaff(currentList);
        return bestList;
    }

    private void findOptimalStaff(List<Baggage> currentList){
        if (!currentList.isEmpty()){
            mayCurrentListIsBest(currentList);
        }
        for (int i=0; i<currentList.size();i++){
            List<Baggage> checkList = new ArrayList<>(currentList);
            checkList.remove(i);
            findOptimalStaff(checkList);
        }
    }

    private Integer calcWeightInCurrentList(List<Baggage> currentList){
        Integer sum=0;
        for (Baggage baggage : currentList) {
            sum+=baggage.getWeight();
        }
        return sum;
    }

    private Integer calcPriceInCurrentList(List<Baggage> currentList){
        Integer sum=0;
        for (Baggage baggage : currentList) {
            sum+=baggage.getPrice();
        }
        return sum;
    }

    private void mayCurrentListIsBest (List<Baggage> currentList){
        if (bestList.isEmpty()){
            if(calcWeightInCurrentList(currentList)<=backpack.getMaxWeight()){
                bestList=currentList;
                bestPrice=calcPriceInCurrentList(currentList);
            }
        }
        else {
            if(calcWeightInCurrentList(currentList)<=backpack.getMaxWeight() && calcPriceInCurrentList(currentList)>bestPrice){
                bestList=currentList;
                bestPrice=calcPriceInCurrentList(currentList);
            }
        }
    }

}
