package ejerciciosClase;

import java.util.Random;

public class tarea08 implements Runnable {

    private String nombre;

    public tarea08(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){
            System.out.println("Iteracion " + i + " de " + nombre);

            try{

                Random random = new Random();

                int numero = random.nextInt(500, 2001);

                Thread.sleep(numero);



            }catch (InterruptedException e){
                e.getMessage();
            }

        }

    }

    public static void main(String args[]){

        tarea08 t = new tarea08("hilo1");
        tarea08 t2 = new tarea08("hilo2");
        tarea08 t3 = new tarea08("hilo3");
        tarea08 t4 = new tarea08("hilo4");

        Thread h = new Thread(t);
        Thread h2 = new Thread(t2);
        Thread h3 = new Thread(t3);
        Thread h4 = new Thread(t4);

        long inicio = System.currentTimeMillis();

        h.start();
        h2.start();
        h3.start();
        h4.start();

        try{
            h.join();
            h2.join();
            h3.join();
            h4.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        long fin = System.currentTimeMillis();

        long tiempototal = inicio + fin;

        System.out.println("Terminaron todos, tiempo: " + tiempototal);




    }
}
