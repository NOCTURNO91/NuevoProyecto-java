package org.example;

import clases.Escuderia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        String[] nombres = new String[5];

        Escuderia[] escuderias = new Escuderia[10];

        Scanner lea = new Scanner(System.in);

        //recorriendo arreglos PARA LLENARLO
        for (int i = 0; i<nombres.length; i++) {

            System.out.println("digite el nombre: " + (+i));
            nombres[i] = lea.next();


            //RECORRER UN ARREGLO PARA MOSTRAR QUE TIENE POR DENTRO
            for (int i = 0; i<nombres.length; i++) {
                System.out.println(nombres[i]);


            }



        }
    }