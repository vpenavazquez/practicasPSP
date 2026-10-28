package ejercicio4;

public class Almacen {



    private String producto = null;

    public synchronized void poner (String p){
       try {

           while (producto != null){

               wait();


           }

           producto = p;

           System.out.println("Producido: " + p);

           notifyAll();

       }catch (InterruptedException e){
           System.out.println(e.getMessage());
       }


    }

    public synchronized String sacar() {
        String valorGuardado = null;
        try {
            while (producto == null) {
                wait();
            }
            valorGuardado = producto;
            producto = null;
            System.out.println("Consumido: " + valorGuardado);
            notifyAll();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return valorGuardado;
    }




}
