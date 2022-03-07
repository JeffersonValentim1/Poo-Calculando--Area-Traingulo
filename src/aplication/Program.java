package aplication;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner( System.in);
        Triangle x, y;

        // instanciar objeto
        x = new Triangle();
        y = new Triangle();

        double soma;
        System.out.println(" Enter the menansure of traingle x: ");
        x.a = sc.nextDouble();
        x.b= sc.nextDouble();
        x.c= sc.nextDouble();

        System.out.println(" Enter the menansure of traingle y : ");
        y.a= sc.nextDouble();
        y.b= sc.nextDouble();
        y.c= sc.nextDouble();

        // instanciando o objeto
        double areaX = x.area();
        double areay = y.area();

        System.out.printf("Triangle x area: %.4f%n", areaX);
        System.out.printf(" Traingle y area: %.4f%n", areay);

        if (areaX > areaX){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: y");
        }

        sc.close();
    }
}
