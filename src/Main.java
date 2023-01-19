import hilos.Hilos;
import notas.Notas;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Notas notas = new Notas();
        notas.generarNotas();

        Hilos hilo1 = new Hilos(1, notas);
        Hilos hilo2 = new Hilos(2, notas);
        Hilos hilo3 = new Hilos(3, notas);
        Hilos hilo4 = new Hilos(4, notas);
        Hilos hilo5 = new Hilos(5, notas);
        Hilos hilo6 = new Hilos(6, notas);
        Hilos hilo7 = new Hilos(7, notas);
        Hilos hilo8 = new Hilos(8, notas);
        Hilos hilo9 = new Hilos(9, notas);
        Hilos hilo10 = new Hilos(10, notas);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();

        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        hilo5.join();
        hilo6.join();
        hilo7.join();
        hilo8.join();
        hilo9.join();
        hilo10.join();


    }
}