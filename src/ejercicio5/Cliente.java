package ejercicio5;

public class Cliente implements Runnable{

    private Discoteca discoteca;

    private String nombre;

    public Cliente(Discoteca discoteca, String nombre) {
        this.discoteca = discoteca;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        discoteca.entrar(this.nombre);
        try{

            Thread.sleep(1000);



        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        discoteca.salir(this.nombre);


    }
}
