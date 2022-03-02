package ru.danilsibgatyllin.lesson5.ex1;

public class SquareService {

    public static float square(float num, int degree){
        if (degree==0){
            return 1;
        }
        if (degree==1){
            return num;
        }
        if (degree==-1){
            return num * (1f/num) ;
        }
        if (degree<0){
            return num* (1f%square(num,++degree));
        }
        else {
            return num*square(num,--degree);
        }
    }

}
