package ru.danilsibgatyllin.lesson5.ex2;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private Integer totalPrice;
    private Integer maxWeight;
    private List<Baggage> baggageInBackpack;

    public Backpack(Integer maxWeight) {
        this.maxWeight = maxWeight;
        this.totalPrice=0;
        this.baggageInBackpack = new ArrayList<>();
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Baggage> getBaggageInBackpack() {
        return baggageInBackpack;
    }

    public void setBaggageInBackpack(List<Baggage> baggageInBackpack) {
        this.baggageInBackpack = baggageInBackpack;
    }
}