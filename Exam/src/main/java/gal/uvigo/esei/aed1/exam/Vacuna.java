/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gal.uvigo.esei.aed1.exam;

/**
 *
 * @author amado
 */
public class Vacuna {

    private int codigo;
    private String nombre;
    private TipoDesarollo desarollo;

    public Vacuna(int codigo, String nombre, TipoDesarollo desarollo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.desarollo = desarollo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoDesarollo getDesarollo() {
        return desarollo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Codigo: ").append(codigo).append("; ").append("Nombre: ").append(nombre).append("; ").append("Tipo de desarollo: ").append(desarollo);
        return sb.toString();
    }

}
