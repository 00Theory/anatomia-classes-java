package EstruturaDados.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    
    public static void main(String[] args){


        List<Map<String, String>> listaAlunos = new ArrayList<>();


        Map<String, String> aluno1 = new HashMap<>();

        aluno1.put("Nome", "João");
        aluno1.put("Idade", "17");
        aluno1.put("Media", "7.5");
        aluno1.put("Turma", "3a");

        listaAlunos.add(aluno1);
    
        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "16");
        aluno2.put("Media", "8.5");
        aluno2.put("Turma", "3a");

        listaAlunos.add(aluno2);

        Map<String, String> aluno3 = new HashMap<>();

        aluno3.put("Nome", "Camila");
        aluno3.put("Idade", "16");
        aluno3.put("Media", "9");
        aluno3.put("Turma", "3b");

        listaAlunos.add(aluno3);
        Map<String, String> aluno4 = new HashMap<>();

        aluno4.put("Nome", "Camilo");
        aluno4.put("Idade", "16");
        aluno4.put("Media", "6.3");
        aluno4.put("Turma", "3b");

        listaAlunos.add(aluno4);

        System.out.println(listaAlunos);
        System.out.println(aluno1.keySet());
        System.out.println(aluno1.values());
    }

}
