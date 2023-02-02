package com.company;

public class Two {
    double lenght ;
    double width ;

    public Two(double lenght,double width){
        this.lenght = lenght;
        this.width = width;
    }
    void profil(){
        double s =  lenght * width;
        System.out.println("Площа прямокутника: " + s);
    }
    void profil(double lenght,double width){
        double s =  lenght * width;
        System.out.println("Площа прямокутника" + s);
    }
}
