package ejercicio3;

public class ContadorEntradas  {

    private int entradasVendidas = 0;

    public synchronized void venderEntradas(){

        entradasVendidas += 1;



    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }



}
