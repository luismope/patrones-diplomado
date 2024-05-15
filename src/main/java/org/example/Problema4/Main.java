package org.example.Problema4;

public class Main {
   public static void main(String[] args)
   {
      //Procesando JSON de forma normal
      Conversora normal=new ProcessJSON();
      normal.procesarJSON("archivo.json");

      //enviando JSON pero usando servicio de tercero
      Conversora conversora=new AdaptadorJSON();
      conversora.procesarJSON("archivo.json");
   }
}
