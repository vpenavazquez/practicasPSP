package ejercicio3;

public class Cine {

    public static void main(String args []){


        ContadorEntradas ce = new ContadorEntradas();

        cajero c = new cajero(ce);
        cajero c2 = new cajero(ce);
        cajero c3 = new cajero(ce);
        cajero c4 = new cajero(ce);
        cajero c5 = new cajero(ce);

        Thread h1 = new Thread(c);
        Thread h2 = new Thread(c2);
        Thread h3 = new Thread(c3);
        Thread h4 = new Thread(c4);
        Thread h5 = new Thread(c5);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();

        try{

            h1.join();
            h2.join();
            h3.join();
            h4.join();
            h5.join();

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(ce.getEntradasVendidas());


    }






}
