package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları
        // bulan ve bu sayıları ekrana yazan programı yazın.

        Scanner input=new Scanner(System.in);
        System.out.print ("lütfen N sayısını giriniz : ");

        int counter= input.nextInt();
        int counter2=0;
        int numbers=0;
        int minNumber=0;
        int maxNumber=0;
        for (int i = 0; i < counter; i++) {
            counter2++;
            System.out.print("lütfen "+counter2+". sayısını giriniz : ");
            numbers=input.nextInt();

            if (maxNumber<numbers){
                maxNumber=numbers;
            }
            minNumber=maxNumber;
            if (minNumber>numbers){
                minNumber=numbers;
            }


        }

        System.out.println("max number : "+maxNumber);
        System.out.println("min number : "+ minNumber);




    }
}
