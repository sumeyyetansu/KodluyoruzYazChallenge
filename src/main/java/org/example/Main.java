package org.example;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir text giriniz : ");
        String text = scanner.nextLine();

        //Textin hepsini küçük harf yapıyoruz çünkü java büyük küçük harf duyarlı bir dildir.
        //Tekrar eeden harfleri bulmak için hepsinin aynı boyutta olması gerekir.
        System.out.println(text.toLowerCase());

        //Kelimelerin arasındaki boşlukları kaldırmak için kullanıyoruz.
        String noSpace = text.replace(" ", "");

        //Textin başındaki ve sonundaki boşlukları kaldırmak için kullanıyoruz.
        String trim = text.trim();

        int number = 0;
        int index = 0;
        int count ;

        for (int i = 0; i < text.length(); i++) {
            //countu 1 belirledik çünkü üzerinde bulunduğu harf 1 olur .Aynı harften 1 tane daha varsa tekrar eden harf sayısı 2 olur.
            count = 1;

            for (int j = 0; j < text.length(); j++) {
                if ((i != j) && (text.charAt(i)== text.charAt(j))) {
                    count ++;
                }
            }
            if (count > number) {
                number = count;
                index = i;
            }
        }
        System.out.println("Most Repeated Letter = " + text.charAt(index) + "\n" + "Maximum Number of Repetitions =" + number);

    }
}
