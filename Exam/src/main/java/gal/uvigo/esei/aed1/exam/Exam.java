/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package gal.uvigo.esei.aed1.exam;

/**
 *
 * @author amado
 */
public class Exam {
//Amadou es amadou
    private static final int MAX_VACUNAS = 100;
    private Laboratorio laboratorio;
    private Entrada entrada;

    public Exam() {
        laboratorio = new Laboratorio(MAX_VACUNAS);
        entrada = new Entrada();
    }

    private void listarVacunas() {
        if (laboratorio.getnumVacunas() == 0) {
            throw new IllegalArgumentException("No hay vacunas que listar");
        }

        System.out.println(laboratorio + "\n");

    }

    public void ejercicio1() {
        laboratorio.insertar(1, "varicela", TipoDesarollo.PROTEINAS);
        laboratorio.insertar(2, "gripe", TipoDesarollo.VIRALES);

    }

    public void ejercicio2() {
        laboratorio.insertar(3, "hepatitis", leerDesarollo());
        listarVacunas();

    }

    public void ejercicio3(TipoDesarollo desarollo) {
        int contador = 0;
        for (int i = 0; i < laboratorio.getnumVacunas(); i++) {
            if (desarollo == laboratorio.getVacuna(i).getDesarollo()) {
                contador++;

            }
        }
        System.out.println("El numero de vacunas del tipo "+desarollo+" es "+contador);

    }

    public TipoDesarollo leerDesarollo() {

        int pos;
        do {
            for (TipoDesarollo desarollo : TipoDesarollo.values()) {
                System.out.println((desarollo.ordinal() + 1) + "._ " + desarollo);

            }
            pos = entrada.LerEntero("Introduzca la posicion: ");
        } while (pos < 0 || pos > TipoDesarollo.values().length);
        --pos;
        return TipoDesarollo.values()[pos];
    }

    public static void main(String[] args) {
        Exam examen = new Exam();
        examen.ejercicio1();
        examen.ejercicio2();
        examen.ejercicio3(TipoDesarollo.ARN);

    }
}
