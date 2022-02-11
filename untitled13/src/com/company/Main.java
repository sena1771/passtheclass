package com.company;

import java.util.Scanner;

public class Main {
    private static int toplam;
    int a,b,c,d,e;
 double ortalama;
    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        int a = input.nextInt();
        if(a>=0 && a<=100) {
            toplam += a;
        }
        System.out.print("Fizik notunuz: ");
int b= input.nextInt();
if(b>=0 && b<=100){
    toplam+=b;
}
        System.out.print("Türkçe notunuz: ");
int c= input.nextInt();
if(c>=0 && c<=100){
    toplam+=c;
}
        System.out.print("Kimya notunuz: ");
        int d= input.nextInt();
        if(d>=0 && d<=100) {
            toplam+=d; }
            System.out.print("Müzik notunuz: ");

        int e= input.nextInt();
        if(e>=0 && e<=100) {
            toplam+=e;
        }
        double ortalama= (toplam/5);
    System.out.print("Ortalama notunuz: " +ortalama);
    if(ortalama>=55) {
        System.out.print("Sınıfı geçtiniz");
    } else{
        System.out.print("Sınıfta kaldınız");
    }
    } }
