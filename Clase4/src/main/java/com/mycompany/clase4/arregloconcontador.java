package com.mycompany.clase4;

import java.util.Scanner;

public class arregloconcontador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numero = new float[5];
        System.out.println("Digite los datos del arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ")" + ".Digite numero");
            numero[i] = entrada.nextFloat();

        }
        System.out.println("Los datos del arreglo son");
        for (int i = 0; i < 5; i++) {
            System.out.println("Los datos :" + numero[i]);
        }
        System.out.println("Los datos del arreglo son");
        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println("Los datos :" + numero[i]);
        }

    }

}
