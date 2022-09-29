/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aritmetica2;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Aritmetica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca el primer entero");
        Scanner ent = new Scanner(System.in);
        Integer var1 = Integer.parseInt(ent.nextLine());
        System.out.println("Introduzca el segundo entero");
        Integer var2 = Integer.parseInt(ent.nextLine());
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion; 
        while (!salir) {
            System.out.println("1. Opcion 1: Suma");
            System.out.println("2. Opcion 2: Resta");
            System.out.println("3. Opcion 3: Division");
            System.out.println("4. Opcion 3: Multiplicacion");
            System.out.println("5. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("El resultado de la suma es: ");
                        operaciones.operaciones.sumar(var1, var2);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("El resultado de la resta es: ");
                        operaciones.operaciones.restar(var1, var2);
                        break;
                    case 3:
                        try{
                            System.out.println("Has seleccionado la opcion 3");
                            System.out.println("El resultado de la division es: ");
                            operaciones.operaciones.division(var1, var2);
                        }catch(Exception e){
                            System.out.println("No se puede dividir entre 0");
                            sn.next();
                        }
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        System.out.println("El resultado de la multiplicacion es: ");
                        operaciones.operaciones.multi(var1, var2);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        
        /**
        *operaciones op = new operaciones();
        *Scanner ent = new Scaner(System.in),
        *sout
        *int a = ent.nextInt();
        *sout la suma de a + b = + op.suma(a,b);
        */
        
        
        
    }
    
}
