package org.example.Problema3;

public class PDFGeneradorInformes extends TemplateGeneradorInformes{


    @Override
    public void consultarDB() {
        //Logica para consultar DB
        System.out.println("Consultando la base de datos para el informe en formato PDF...");
    }

    @Override
    public void aplicarCalculos() {
        //Logica para aplicar los calculos
        System.out.println("Aplicando calculos para formato PDF...");
    }

    @Override
    public void resultadoFinal() {
        //Logica para exportar a PDF
        System.out.println("Aplicando logica para exportar a formato PDF...");
    }
}
