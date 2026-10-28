package ejercicio2;

public class centroDescargas {


    public static void main(String args[]){

        DescargaArchivo d = new DescargaArchivo("pp.txt");
        DescargaArchivo d1 = new DescargaArchivo("aa.txt");
        DescargaArchivo d2 = new DescargaArchivo("ww.txt");

        Thread hilo = new Thread(d);
        Thread hilo2 = new Thread(d1);
        Thread hilo3 = new Thread(d2);


        hilo.start();
        hilo2.start();
        hilo3.start();

        try{

            hilo.join();
            hilo2.join();
            hilo3.join();


        }catch (InterruptedException e){

                System.out.println(e.getMessage());

        }

        System.out.println("Todas las descargas han finalizado con exito");



    }




}
