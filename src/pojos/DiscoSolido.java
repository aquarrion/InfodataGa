package pojos;

import interfaces.IReseteable;

import java.util.Date;

public class DiscoSolido extends Tecnologico implements IReseteable {
    private int capacidad;

    public DiscoSolido(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante, int capacidad){
        super(codigo, modelo, paisOrigen, fechaFabricacion, fabricante);

        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void reset() {
        System.out.println("Formateando Disco Solido...");
    }
}
