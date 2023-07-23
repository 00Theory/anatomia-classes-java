package estudar.marco.variaveisTipos;

public class Ternario{
    public static void main(String[] args) {
        int numero = 2;
        System.out.println(numero);
        System.out.println(++numero); //soma-se o numero
        System.out.println(--numero); //diminui-se o numero após sua soma na linha anterior
        System.out.println(++numero + --numero);

        System.out.println("\n" + numero ++); // incremento acontece após a função ter sido executada
        System.out.println(numero);

        numero++;
        System.out.println("\n" + numero);
    }
}