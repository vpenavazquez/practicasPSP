package ejercicio5;

public class Fiesta {

    public static void main(String args[]){


        Discoteca discoteca = new Discoteca();

        for(int i = 0; i < 10; i++){

            Cliente c = new Cliente(discoteca, "Cliente " + i );

            Thread hilo = new Thread(c);

            hilo.start();




        }



    }


}
