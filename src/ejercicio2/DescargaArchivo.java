package ejercicio2;

import java.util.Random;

public class DescargaArchivo implements Runnable {

    private String nombre;


    public DescargaArchivo(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void run() {
        Random random = new Random();

        int numero =  random.nextInt(1000, 3001);

        System.out.println("Inicio de descarga" + nombre);

        try {

            Thread.sleep(numero);

        }catch (InterruptedException e){

            System.out.println(e.getMessage());


        }

        System.out.println(nombre + " descarga completada en " + numero + "ms");

    }
}
