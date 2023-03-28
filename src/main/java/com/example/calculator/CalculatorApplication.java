package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {


   Scanner skaner = new Scanner(System.in);

    System.out.println("Podaj liczbę");
    double x = skaner.nextDouble();
    skaner.nextLine();

    System.out.println("Podaj drugą liczbę");
    double y = skaner.nextDouble();
    skaner.nextLine();

    System.out.println("(d) Dodawanie / (o) Odejmowanie ");
    String dzialanie = skaner.next();

    if(dzialanie.equals("d")) {
        System.out.println(x + "+" + y + "=" +(x+y));
    } else if (dzialanie.equals("o")){
        System.out.println(x + "-" + y + "=" +(x-y));
    }
    }
}
