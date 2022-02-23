package ru.danilsibgatyllin.lesson2.models;

import java.util.Objects;

public class Notebook implements Comparable<Notebook> {

    private Brand brand;

    private Integer price;

    private Integer ram;

    public Notebook(Brand brand, Integer price, Integer ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    @Override
    public int compareTo(Notebook notebook) {
        if(!this.price.equals(notebook.price)){
            return  this.price - notebook.price;
        }
        if(!this.ram.equals(notebook.ram)){
            return  this.ram - notebook.ram;
        }
        if(!this.brand.equals(notebook.brand)){
            return this.brand.ordinal()-notebook.brand.ordinal();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(brand, notebook.brand) && Objects.equals(price, notebook.price) && Objects.equals(ram, notebook.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, ram);
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }


}
