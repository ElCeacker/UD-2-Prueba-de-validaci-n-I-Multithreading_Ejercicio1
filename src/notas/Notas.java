package notas;

import java.util.ArrayList;
import java.util.List;

public class Notas {

    private final int TOTALCALIFICACIONES = 100000;
    private List<Integer> calificaciones = new ArrayList<Integer>();
    private int notasSumadas = 0;

    public void generarNotas() {
        for (int i = 0; i < TOTALCALIFICACIONES; i++) {
            int calificacionesRandom = (int) (Math.random() * 10);
            calificaciones.add(calificacionesRandom);
        }
        System.out.println("Las notas se han generado...");
    }

    public synchronized void notasSumadasAnadidas(int notasSumadas) {
        this.notasSumadas += notasSumadas;
    }

    public List<Integer> getCalificaciones() {
        return calificaciones;
    }

    public int getNotasSumadas() {
        return notasSumadas;
    }
}
