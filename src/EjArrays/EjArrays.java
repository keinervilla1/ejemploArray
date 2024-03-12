/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjArrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class EjArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Aprendiz> listaAprendiz = new ArrayList<Aprendiz>();
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Aprendiz miAprendiz = new Aprendiz();
            miAprendiz.setId(i);
            System.out.println("ingrese nombre: ");
            miAprendiz.setNombre(teclado.next());
            System.out.println("ingrese la primera nota");
            miAprendiz.setN1(teclado.nextInt());
            System.out.println("ingrese la segunda nota");
            miAprendiz.setN2(teclado.nextInt());
            System.out.println("ingrese la tercera nota");
            miAprendiz.setN3(teclado.nextInt());

            listaAprendiz.add(miAprendiz);
            

        }
        System.out.println("Imprimiendo los aprendices agregados a la lista");
        for (Aprendiz var : listaAprendiz) {
            System.out.println(var.getNombre());
            float prom = var.promedio();
            System.out.println("su promedio es "+prom);

        }
    }

}
