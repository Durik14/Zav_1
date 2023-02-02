package com.company;

public class three {
    double lenght ;
    double width ;

    public three(double lenght,double width){
        this.lenght = lenght;
        this.width = width;
    }
    void profil(){
        double l = 2 * lenght;
        System.out.println("Сума довжин прямокутника : " + l);
    }
    void profil(int x ){
        double l = x * lenght;
        System.out.println("Сума довжин прямокутника : " + l);
    }
}
