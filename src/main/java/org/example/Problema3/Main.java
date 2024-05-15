package org.example.Problema3;

public class Main {
    public static void main(String[] args) {
        //Generacion de informes PDF
        TemplateGeneradorInformes pdfReporte = new PDFGeneradorInformes();
        pdfReporte.generarReportes();

        //Generacion de informes Excel
        TemplateGeneradorInformes excelReporte = new ExcelGeneradorInformes();
        excelReporte.generarReportes();

        //Generacion de informes HTML
        TemplateGeneradorInformes HTMLReporte = new HTMLGeneradorInformes();
        HTMLReporte.generarReportes();
    }
}