/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gal.uvigo.esei.aed1.exam;

/**
 *
 * @author amado
 */
public class Laboratorio {

    private Vacuna[] vacunas;
    private int numVacunas;

    public Laboratorio(int maxVacunas) {
        this.vacunas = new Vacuna[maxVacunas];

    }

    public Vacuna getVacuna(int pos) {
        return vacunas[pos];
    }

    public int getMaxVacunas() {
        return vacunas.length;
    }

    public int getnumVacunas() {
        return numVacunas;
    }

    public void insertar(int codigo, String nombre, TipoDesarollo desarollo) {
        int i = 0;
        Vacuna insertar = new Vacuna(codigo, nombre, desarollo);

        if (numVacunas == vacunas.length) {
            throw new IllegalArgumentException("No se pueden añadir mas vacunas.");
        }
        while (i < numVacunas && codigo != vacunas[i].getCodigo()) {
            i++;
        }
        if (i != numVacunas) {
            if (vacunas[i].getDesarollo().getEfectividad() > desarollo.getEfectividad()) {
                throw new IllegalArgumentException("Este codigo ya existe y la vacuna es de peor efectividad: ");
            } else {
                vacunas[i] = insertar;
            }

        } else {
            vacunas[numVacunas++] = insertar;
        }
    }

    @Override
    public String toString() {
        StringBuilder toRet = new StringBuilder();
        toRet.append("Laboratorio{ , numVacunas=").append(numVacunas).append(" num max vacunas= ").append(vacunas.length);
        for (int i = 0; i < numVacunas; i++) {
            toRet.append('\n').append(vacunas[i]);
        }
        return toRet.toString();
    }
}
