package estudar.marco.anatomiaclasse;
public class MinhaClasse {

    
    public static void main(String[] args) {
        int ola = 0;
        int valor = 1;
        ola = somar(valor, 1);
        System.out.println("Aqui o valor: " + ola);
    }

    public static int somar (int par1, int par2){
            return par1 + par2;
        }
}
