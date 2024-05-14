package patrones.estructurales.adapter;

public class ProcessJSON implements Conversora{
   @Override
   public void procesarJSON(String file) {
      System.out.println("Procesando archivo JSON "+file+" normalmente...");
   }
}
