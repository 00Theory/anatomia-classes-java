package EstruturaDados.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main (String[] args){
        
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeut")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.add(new Carro("Renault")));

        System.out.println(queueCarros.peek()); // Mostra o primeiro da fila
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); // Mostra e remove o primeiro da fila
        System.out.println(queueCarros);
    }

}
