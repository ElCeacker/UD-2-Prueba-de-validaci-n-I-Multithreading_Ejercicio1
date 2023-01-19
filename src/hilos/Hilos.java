package hilos;

import notas.Notas;

import java.util.List;

public class Hilos extends Thread{

    private int identificador;
    Notas notas = new Notas();

    private final int TOTAL_CALIFICACIONES_SUMAR = 10000;
    private int sumaTotal = 0;

    public Hilos(int identificador, Notas notas) {
        this.identificador = identificador;
        this.notas = notas;
    }

    public int sumarNotas() {

        for (int i = 0; i <= TOTAL_CALIFICACIONES_SUMAR; i++) {
            sumaTotal += notas.getCalificaciones().get(i);
        }

        return sumaTotal;
    }

    @Override
    public void run() {
        System.out.println("Estas son las notas sumadas " + sumarNotas());

    }
}
