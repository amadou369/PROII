/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package gal.uvigo.esei.aed1.exam;

/**
 *
 * @author amado
 */
public enum TipoDesarollo {
    ARN(82.5),
    VIRALES(91.1),
    PROTEINAS(87.9);

    private double efectividad;

    private TipoDesarollo(double efectividad) {
        this.efectividad = efectividad;
    }

    public double getEfectividad() {
        return efectividad;
    }

}
