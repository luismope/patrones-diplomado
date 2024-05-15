package org.example.problema3;

public class HTMLGeneradorInformes extends TemplateGeneradorInformes{
    @Override
    public void formatoLegible() {
        //Logica para consultar DB
        System.out.println("Exportando HTML a formato legible para la consulta en la DB...");
    }

    @Override
    public void consultarDB() {
        //Logica para consultar DB
        System.out.println("Consultando la base de datos para el informe en formato HTML...");
    }

    @Override
    public void aplicarCalculos() {
        //Logica para aplicar los calculos
        System.out.println("Aplicando calculos para formato HTML...");
    }

    @Override
    public void resultadoFinal() {
        //Logica para exportar a PDF
        System.out.println("Aplicando logica para exportar a formato HTML...");
    }
}
