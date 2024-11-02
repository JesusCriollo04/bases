package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        //clcular el area de un triaungulo y area de circulo 
        double base;
        double altura;
        double respuesta;
        Scanner input= new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.print("Ingrese base de triaungulo: ");
        base=input.nextDouble();
        System.out.println("Ingresa la altura del triangulo: ");
        altura= input.nextDouble();
        respuesta=(base*altura)/2;
        System.out.print("El area del triangulo es: " + respuesta);
    }
}
