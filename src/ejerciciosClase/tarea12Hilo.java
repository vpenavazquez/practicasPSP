package ejerciciosClase;

public class tarea12Hilo implements Runnable {
    private tarea12Contador contador;

    public tarea12Hilo(tarea12Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100000; i++ ){
            contador.incrementarContaodor();
        }
    }

    public static void main(String args[]){
        tarea12Contador contador = new tarea12Contador();

        tarea12Hilo tarea = new tarea12Hilo(contador);
        Thread h1 = new Thread(tarea);
        Thread h2 = new Thread(tarea);
        Thread h3 = new Thread(tarea);
        Thread h4 = new Thread(tarea);
        Thread h5 = new Thread(tarea);

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
            e.getMessage();
        }

        System.out.println(contador.getContador());

    }
}
