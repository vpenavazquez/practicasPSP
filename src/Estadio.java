public class Estadio{


    public static void main(String args[]){
        Torno t = new Torno(1);
        Torno t1 = new Torno(2);
        Torno t2 = new Torno(3);
        Torno t3 = new Torno(4);


        Thread hilo = new Thread(t);
        Thread hilo1 = new Thread(t1);
        Thread hilo2 = new Thread(t2);
        Thread hilo3 = new Thread(t3);


        Thread[] hilos = new Thread[4];


        hilos[0] = hilo;
        hilos[1] = hilo1;
        hilos[2] = hilo2;
        hilos[3] = hilo3;


        for(int i = 0; i < hilos.length; i++){


            hilos[i].start();






        }


        for(int i = 0; i < hilos.length; i++){


            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


        System.out.println("Torno: " + t.getId() + " Entradas: " + t.getEntradas());
        System.out.println("Torno: " + t1.getId() + " Entradas: " + t1.getEntradas());
        System.out.println("Torno: " + t2.getId() + " Entradas: " + t2.getEntradas());
        System.out.println("Torno: " + t3.getId() + " Entradas: " + t3.getEntradas());


        System.out.println(Torno.getMarcadorTotal());




    }


}