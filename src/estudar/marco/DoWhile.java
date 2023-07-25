package estudar.marco;
import java.util.concurrent.ThreadLocalRandom;

public class DoWhile{
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho.");
            mesada = mesada - valorDoce;
        }
        System.out.println("Joãozinho agora só tem " + mesada + " reais");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}