import models.Caja;
import models.Par;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("=== PRÁCTICA DE CLASES GÉNERICAS ===");
        System.out.println();

        System.out.println("--- Uso de Caja<T> ---");
        Caja<String> cajaTexto = new Caja<>("Hola mundo");
        Caja<Integer> cajaEntero = new Caja<>(100);
        Caja<Double> cajaDecimal = new Caja<>(9.75);

        System.out.println("Caja de texto: " + cajaTexto.getDato());
        System.out.println("Caja de entero: " + cajaEntero.getDato());
        System.out.println("Caja de decimal: " + cajaDecimal.getDato());
        System.out.println("¿La caja de texto está vácia?: " + cajaTexto.estaVacia());

        System.out.println();

        System.out.println("--- Uso de Par<K,V> ---");
        Par<Integer, String> par1 = new Par<>(1,"Juan Pérez");
        Par<String, Integer> par2 = new Par<>("Edad", 20);
        Par<String, Double> par3 = new Par<>("Promedio", 8.75);

        System.out.println("Clave: " + par1.getClave() + " | Valor: "+ par1.getValor());
        System.out.println("Clave: " + par2.getClave() + " | Valor: "+ par2.getValor());
        System.out.println("Clave: " + par3.getClave() + " | Valor: "+ par3.getValor());


    }
}
