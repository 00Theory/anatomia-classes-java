package EstruturaDados.filas;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new NoFila("primeiro"));
        minhaFila.enqueue(new NoFila("segundo"));
        minhaFila.enqueue(new NoFila("terceiro"));
        minhaFila.enqueue(new NoFila("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new NoFila("último"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        minhaFila.enqueue(new NoFila("sexto"));
        System.out.println(minhaFila);

    }
}
