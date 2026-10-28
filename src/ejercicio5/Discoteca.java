package ejercicio5;


import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Discoteca {
    private Semaphore aforo = new Semaphore(3);
    private AtomicInteger totalClientes = new AtomicInteger(0);

    public void entrar(String nombreCliente){

        try{

            aforo.acquire();
            totalClientes.incrementAndGet();

            System.out.println(nombreCliente + " ha entrado Aforo actial: " + totalClientes.get());

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }



    }

    public void salir(String nombreCliente){

        System.out.println(nombreCliente + " ha salido");

        aforo.release();



    }




}
