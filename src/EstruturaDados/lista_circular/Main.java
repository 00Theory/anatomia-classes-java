package EstruturaDados.lista_circular;

public class Main {

    public static void main(String[] args){
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        System.out.println("<------------>");

        minhaListaCircular.add("c1");
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        minhaListaCircular.add("c4");
        minhaListaCircular.add("c5");
        System.out.println(minhaListaCircular);

        for (int i = 0; i <= 4; i++){
            System.out.println(minhaListaCircular.get(5*i + 0));
        }

        for(int j = 0; j <= 4; j++){
            System.out.println(minhaListaCircular.get(5*j + 1));
        }

        for(int k = 0; k <= 4; k++){
            System.out.println(minhaListaCircular.get(5*k + 2));
        }

        for(int l = 0; l <= 4; l++){
            System.out.println(minhaListaCircular.get(5*l + 3));
        }

        for(int m = 0; m <= 4; m++){
            System.out.println(minhaListaCircular.get(5*m + 4));
        }

        
 
    }
    
}
