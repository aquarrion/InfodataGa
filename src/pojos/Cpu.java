package pojos;

public class Cpu extends Producto{
    private int memoriaPrincipal;

    public Cpu(String codigo, String modelo, int memoriaPrincipal){
        super(codigo, modelo);

        this.setMemoriaPrincipal(memoriaPrincipal);
    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }
}
