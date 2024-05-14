package patrones.estructurales.adapter;


import javax.swing.*;

public class AdaptadorJSON implements Conversora
{
   ServiceTercero service;
   @Override
   public void procesarJSON(String file) {
      service=new ServiceTercero();
      //Lógica para convertir JSON a KML, esto genera un archivo que podemos volver String
      System.out.println("Convirtiendo JSON-KML.......");
      String fileKML="..Archivo KML generado..";
      service.procesarKML(fileKML);
   }
}
