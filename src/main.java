import pojos.*;

import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        //producto
        Producto producto = new Producto("C12321","Teclado gamer RGB");
        System.out.println(producto);

        //alquilable
        Alquilable alquilable = new Alquilable("A231","LG 14pulgadas",15.5);
        System.out.println(alquilable);

        //tecnologico
        Empresa empresa = new Empresa("DELL","Av. taenke",2000);
        Tecnologico tecnologico = new Tecnologico("C123","Vostro 100","CHINA", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);

        //monitor
        Monitor monitor = new Monitor("AS1231","LG" ,25.5,"4K HD");
        System.out.println(monitor);

        //cpu
        Empresa toshiba = new Empresa("toshiba","Av. beijing",2500);
        Cpu cpu = new Cpu("Q5213","Razor","USA",Calendar.getInstance().getTime(),toshiba,1024);
        System.out.println(cpu);
    }
}
