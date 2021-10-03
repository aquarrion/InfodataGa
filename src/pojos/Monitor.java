package pojos;

public class Monitor extends Producto{
    private String resolucionMaxima;

    public Monitor(String codigo, String modelo, String resolucionMaxima){
        super(codigo, modelo);

        this.setResolucionMaxima(resolucionMaxima);
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }
}
