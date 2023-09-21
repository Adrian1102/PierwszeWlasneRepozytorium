package com.example.kalkulator;

public class Kalkulator {
    int a=7;
    int b=11;
    int dodawanie(){
        return a+b;
    }
    int odejmowanie(){
        return a-b;
    }

    public static void main(String[] args) {
        Kalkulator calculator = new Kalkulator();
        System.out.println(calculator.dodawanie());
        System.out.println(calculator.odejmowanie());
    }
}

