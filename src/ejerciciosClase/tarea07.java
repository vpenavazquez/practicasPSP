package ejerciciosClase;

public class tarea07 implements Runnable{

    private int n;

    public tarea07(int n) {
        this.n = n;
    }



    @Override
    public void run() {


        int a = 1;
        int b = 1;
        int c;

        for(int i = 0; i < n; i++ ){

            System.out.print(a + (i < n - 1 ? ", " : ""));


            c = a + b;
            a = b;
            b = c;


        }
    }

    public static void main(String args[]){

        tarea07 n =new tarea07(15);

        Thread hilo = new Thread(n);

        hilo.start();

        try{
            hilo.join();

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(" Calculo acabado");

    }
}
