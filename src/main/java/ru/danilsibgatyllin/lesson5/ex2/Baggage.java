package ru.danilsibgatyllin.lesson5.ex2;

public class Baggage {

    private String name;

    private Integer price;

    private Integer weight;

    public Baggage(String name,Integer price, Integer weight) {
        this.name=name;
        this.price = price;
        this.weight = weight;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
