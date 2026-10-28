package ejercicio4;

public class Productor implements Runnable{

    private Almacen almacen;

    public Productor(Almacen almacen) {

        this.almacen = almacen;
    }

    @Override
    public void run() {

        for(int i = 0; i < 5; i++){
            String producto = "Producto " + i;
            almacen.poner(producto);


            try{

                Thread.sleep(500);
            }catch (InterruptedException  e){
                System.out.println(e.getMessage());
            }



        }

    }
}
