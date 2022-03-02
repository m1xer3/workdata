package ru.danilsibgatyllin.lesson5.ex2;


import java.util.ArrayList;
import java.util.List;

public class AppStart {
    public static void main(String[] args) {

//        System.out.println(SquareService.square(3f,-1));

        Backpack backpack = new Backpack(10);

        List<Baggage> list = new ArrayList<>();

        BackpackService service = new BackpackService(backpack);

        list.add(new Baggage("aaa",150,3));
        list.add(new Baggage("bbb",10,5));
        list.add(new Baggage("ccc",250,9));
        list.add(new Baggage("ddd",20,3));
        list.add(new Baggage("eee",300,4));
        list.add(new Baggage("fff",60,1));
        list.add(new Baggage("ggg",350,5));
        list.add(new Baggage("ttt",250,2));
        list.add(new Baggage("zzz",550,9));


        List<Baggage> outList = service.getOptimalSet(list);

        for (Baggage baggage : outList) {
            System.out.println("name - "+baggage.getName()+": weight - "+baggage.getWeight()+ ": price - "+baggage.getPrice());
        }

    }
}
