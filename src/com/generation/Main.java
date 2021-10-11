package com.generation;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Control de flujo Switch
//
//        switch(algo){
//            case a:
//                something;
//                break;
//            case b:
//                something;
//                break;
//            default:
//        }
        //Scanner sc=new Scanner(System.in);

//        System.out.println("Ingresa un número");
//        int numero1=sc.nextInt();
//        System.out.println("ingresa otro número");
//        int numero2=sc.nextInt();
//        System.out.println("Ingresa la operación deseada:\n 1)Suma \n 2) Resta \n 3) Multiplicación \n 4) División ");
//
//        int operacion= sc.nextInt();
//        sc.nextLine();
//
//        float resultado=0;
//
//        switch(operacion){
//            case 1:
//                 resultado= numero1+numero2;
//                 break;
//            case 2:
//                resultado=numero1-numero2;
//                break;
//            case 3:
//                resultado =numero1*numero2;
//                break;
//            case 4:
//                resultado=numero1/numero2;
//                break;
//            default:
//                System.out.println("La operación es inválida");
//        }
//        sc.close();
//        System.out.println(resultado);


        /////// Pedir un número al usuario y dependiendo la respuesta
        //        // mostrar un dia de la semana, ejemplo: 1) Domingo, 2) Lunes ... 7)Sabado
        //        // Si elige un numero fuera de ese rango mostar un mensaje de error;

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un número y te mostraré el día de la semana equivalente");
        int numero=sc.nextInt();
        sc.nextLine();
        String dia="";

        switch(numero){
           case 1:
                 dia="Domingo";
                 break;
            case 2:
                dia="Lunes";
                break;
            case 3:
                   dia="Martes";
                break;
            case 4:
                    dia="Miércoles";
                break;
            case 5:
                dia="Jueves";
                break;
            case 6:
                dia="Viernes";
                break;
            case 7:
                dia="Sábado";
                break;
            default:
                System.out.println("La semana solo tiene 7 días (Elige del 1 al 7)");
        }
        sc.close();
        if (numero>1 && numero<8){
            System.out.println("El " + dia + " es el " + numero + "° día de la semana");
        }

    }
}
