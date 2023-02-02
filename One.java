package com.company;

public class One {
   double lenght ;
   double width ;

   public One(double lenght,double width){
       this.lenght = lenght;
       this.width = width;
   }
   void profil(){
       double p = 2 * (lenght + width);
       System.out.println("Периметр прямокутника: " + p);
   }
   void profil(double x){

       double p = x * (lenght + width);
   }
}
