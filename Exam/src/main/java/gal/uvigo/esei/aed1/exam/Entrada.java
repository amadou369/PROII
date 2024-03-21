/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gal.uvigo.esei.aed1.exam;

import java.util.Scanner;

/**
 *
 * @author amado
 */
public class Entrada {
//Amadou tonto
    private Scanner entrada;

    public Entrada() {
        entrada = new Scanner(System.in);
    }

    public String LerCadea(String mensaje) {

        System.out.println(mensaje);
        return entrada.nextLine();
    }

    public int LerEntero(String mensaje) {

        System.out.println(mensaje);
        return Integer.parseInt(entrada.nextLine());
    }

    public double LerFlotante(String mensaje) {
        System.out.println(mensaje);
        return Double.parseDouble(entrada.nextLine());
    }

}
