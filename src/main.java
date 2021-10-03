import pojos.*;

import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        /*
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

         */

        //polimorfismo
        Producto producto = new Producto("ms150","jesus 350");

        Producto lj350 = new Impresora("lj350","canon 500",30);
        //System.out.println(lj350);
        Producto ms200 = new Monitor("ms200","Razor",25.5,"full hd");
        //System.out.println(ms200);
        Producto m500 = new DiscoDuro("m500","dell",15.0,1024);
        //System.out.println(m500);

        Impresora impresora = (Impresora)lj350;
        //System.out.println(impresora);
        Monitor monitor = (Monitor)ms200;
        //System.out.println(monitor);
        DiscoDuro discoDuro = (DiscoDuro)m500;
        //System.out.println(m500);

        Producto[] productos = new Producto[3];
        productos[0] = impresora;
        productos[1] = monitor;
        productos[2] = discoDuro;
        for (int i = 0 ;i < productos.length; i++){
            System.out.println(productos[i]);
        }
    }
}
