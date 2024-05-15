package org.example.problema3;

public abstract class TemplateGeneradorInformes {
    public void generarReportes() {
        formatoLegible();
        consultarDB();
        aplicarCalculos();
        resultadoFinal();
    }

    public void formatoLegible() {}
    public void consultarDB() {}
    public void aplicarCalculos() {}
    public void resultadoFinal() {}

}
