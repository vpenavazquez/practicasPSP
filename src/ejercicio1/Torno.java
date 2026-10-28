package ejercicio1;

import java.util.Random;


public class Torno implements Runnable {


    private int id;
    private int entradas;
    private static int  marcadorTotal;




    public Torno(int id){


        this.id = id;
    }


    public int getEntradas() {
        return entradas;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }


    public static int getMarcadorTotal() {
        return marcadorTotal;
    }


    public void setMarcadorTotal(int marcadorTotal) {
        this.marcadorTotal = marcadorTotal;
    }


    public static synchronized void sincronizar(int cantidad){


        marcadorTotal += cantidad;


    }


    @Override
    public void run() {


        Random random = new Random();


        entradas = 500 + random.nextInt(501);


        sincronizar(entradas);



    }






}