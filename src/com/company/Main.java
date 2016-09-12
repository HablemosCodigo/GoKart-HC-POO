package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Creemos un Go Kart!!\n");

        //Toma un solo parametro
        GoKart goKart = new GoKart("Azul");
        System.out.println("El Go Kart es de color: " + goKart.getColor());
    }
}
