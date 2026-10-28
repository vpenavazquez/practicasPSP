package ejercicio4;

import ejercicio3.ContadorEntradas;

public class Fabrica {

    public static void main(String args[]){

        Almacen almacen = new Almacen();

        Productor p = new Productor(almacen);

        Consumidor c = new Consumidor(almacen);

        Thread hiloConsumidor = new Thread(c);

        Thread hiloProductor = new Thread(p);

        hiloProductor.start();

        hiloConsumidor.start();

        try{

            hiloProductor.join();
            hiloConsumidor.join();

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("simulacion finalizada");
    }

}
