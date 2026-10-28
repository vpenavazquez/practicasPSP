package ejercicio3;

public class cajero implements Runnable {

   private ContadorEntradas contadorEntradas;

    public cajero(ContadorEntradas contadorEntradas) {
        this.contadorEntradas = contadorEntradas;
    }

    @Override
    public void run() {

        for(int i = 0; i < 1000; i++){

            contadorEntradas.venderEntradas();

        }

    }
}
