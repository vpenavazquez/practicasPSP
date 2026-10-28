package ejercicio4;

public class Consumidor implements Runnable {

    private Almacen almacen;

    public Consumidor(Almacen almacen) {
        this.almacen = almacen;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            almacen.sacar();


            try {

                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
