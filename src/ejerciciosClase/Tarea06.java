package ejerciciosClase;

public class Tarea06 implements Runnable{


    private  String nombre;
    private final int limitePaciencia;

    public Tarea06( String nombre ,int limitePaciencia){

        this.limitePaciencia = limitePaciencia;
        this.nombre = nombre;

    }

    @Override
    public void run() {

        String nombre = Thread.currentThread().getName();
        for (int cabreo = 1; cabreo <= limitePaciencia; cabreo++){
            String msg = "[" + nombre + "] Cabreo nivel: " + cabreo;
            if(cabreo == limitePaciencia){
                msg += " he llegado al limite";
            }
            System.out.println(msg);
        }
    }

    public static void main(String arga[]){
        Tarea06 t = new Tarea06("damian", 3);
        Tarea06 t1 = new Tarea06("diego", 6);

        Thread h = new Thread( t, "damian");
        Thread h1 = new Thread(t1, "diego");

        h.start();
        h1.start();


    }
}
