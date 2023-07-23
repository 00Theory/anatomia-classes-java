package estudar.marco.variaveisTipos;

public class Relacionais{
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente do numeroDois? " + simNao + "\n");
        System.out.println("comparação de conteúdos:\n");

        String a = "marquin";
        String b = new String("marquin");

        boolean verificarNome = a == b;

        System.out.println(verificarNome);
        System.out.println(a.equals(b));
    }
}
