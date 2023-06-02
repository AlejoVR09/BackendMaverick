import  javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_java {
    public static void mostrarArray(ArrayList<clsProduct> productos){
        for (int i=0;i<productos.size();i++){
            System.out.print((i+1)+".");
            System.out.print(" ID: "+productos.get(i).getId());
            System.out.print (" - Producto: "+productos.get(i).getNombre());
            System.out.print(" - Precio: "+productos.get(i).getPrecio());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int menu;
        int add, remove;
        Scanner input = new Scanner(System.in);
        ArrayList<clsProduct> productos=new ArrayList<>();
        productos.add(new clsProduct(1,"Tv LG",10000));
        productos.add(new clsProduct(2,"Camara",200000));
        productos.add(new clsProduct(3,"Iphone 14",30000));
        productos.add(new clsProduct(4,"Samsumng galaxy s20",15000));
        productos.add(new clsProduct(5,"Tablet",18000));
        productos.add(new clsProduct(6,"Iphad 3",49000));
        productos.add(new clsProduct(7,"Audifonos",87000));
        productos.add(new clsProduct(8,"Smarwatch",190000));
        productos.add(new clsProduct(9,"Tv Samsumng",100000000));
        productos.add(new clsProduct(10,"Nokia ",9000000));
        menu=-1;
        ArrayList<clsProduct> carrito=new ArrayList<>();
        while(menu!=4){
            System.out.println("\nBienvenido al menu de opciones\n \n1.Agregar producto al carrito. \n2.Eliminar producto del carrito.\n3.Mirar todos los productos.\n4.Salir");
            System.out.print("\nSeleccione la opcion: ");
            menu=input.nextInt();
            switch (menu){
                case 1:{
                    System.out.println("AGREGAR AL CARRITO");
                    add=-1;
                    while(add!=0){
                        mostrarArray(productos);
                        System.out.print("Digite el producto que desea agregar: ");
                        add=input.nextInt();
                        carrito.add(productos.get(add));
                    }
                    break;
                }
                case 2:{
                    System.out.println("ELIMINAR AL CARRITO");
                    remove=-1;
                    while(remove!=0){
                        if (carrito.size()>0){
                            mostrarArray(carrito);
                            System.out.print("Digite el producto que desea eliminar: ");
                            remove=input.nextInt();
                            carrito.remove(remove);
                        }
                        else {
                            break;
                        }


                    }
                    break;
                }
                case 3:{
                    if(carrito.size()>0){
                        System.out.println("PRODUCTOS EN EL CARRiTO");
                        mostrarArray(carrito);
                        input.next();
                        break;
                    }
                    else{
                        System.out.println("No tiene productos en el carrete");
                        input.next();
                    }
                }
                case 4:{
                    break;
                }
            }
        }



    }
}
