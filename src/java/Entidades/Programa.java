package Entidades;

public class Programa {

    public static void main(String[] args) {
        Productos articulo1 = new Productos("Teclado", "negro");
        Productos articulo2 = new Productos("Carro", "blanco", 500000);
        System.out.println(articulo1);
        System.out.println(articulo2);
        System.out.println("El producto: " + articulo1.getNombre() + " tiene el precio: " + articulo1.getPrecio());

        System.out.println("El producto: " + articulo2.getNombre() + " tiene el precio: " + articulo2.getPrecio());

        //carga de productos
//        Productos articulo1;
//        articulo1 = new Productos();
//        articulo1.nombre = "Eco Sport";
//        articulo1.color = "blanco";
//        articulo1.precio = 400000;
//
//        Productos articulo2;
//        articulo2 = new Productos();
//        articulo2.nombre = "Vibrador";
//        articulo2.color = "Piel";
//        articulo2.precio = 57;
       // Productos articulo3;
        //articulo3 = new Productos();
//        articulo3.nombre = "Plancha";
//        articulo3.color = "Plateado";
//        articulo3.precio = 2500;
//        System.out.println(articulo1.nombre + articulo1.color + articulo1.precio);
//        System.out.println(articulo2.nombre + articulo2.color + articulo2.precio);
//        System.out.println(articulo3.nombre + articulo3.color + articulo3.precio);
    }

}
