package com.mycompany.clase4;

import java.util.Date;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, numero, tabla, i;
        Date fecha = new Date();
        String seguir = "s";
        seguir = "s";
        numero = 0;
        while (seguir.equals("S") || seguir.equals("s")) {
            do {
                System.out.println(fecha.toString());
                System.out.println("Menu");
                System.out.println("1) Contador del 1 al 50");
                System.out.println("2) Numeros par o impar");
                System.out.println("3) Tablas de multiplicar");
                System.out.println("4) Salir");
                System.out.println("Ingrese un numero: [1-2-3-4]");
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        for (i = 0; i < 51; i++)
                         {
                            System.out.println("Los numeros son :" + i);
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el numero que desea");
                        numero = entrada.nextInt();
                        if (numero % 2 == 0) {
                            System.out.println(+numero + " es un numero par");
                        } else {
                            System.out.println(numero + " es un numero impar");

                        }
                        break;

                    case 3:
                        System.out.println("Digite la tabla que desea");
                        tabla = entrada.nextInt();
                        for (i = 0; i <= 10; i++)
                         {
                            System.out.println(tabla + "X" + i + "=" + tabla * i);

                        }
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Ingrese numero valido");
                }

            } while (opcion != 4);
            System.out.println("Desea continuar s/n");
            seguir = entrada.next();
        }

    }
}
