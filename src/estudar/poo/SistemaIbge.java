package estudar.poo;

public class SistemaIbge{
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());
        }

        EstadoBrasileiro estado = EstadoBrasileiro.PIAUI;
        System.out.println(estado.getNome());
        System.out.println(estado.getSigla());
        System.out.println(estado.getNomeMaiusculo());
        System.out.println(estado.getIbge());
    }
}