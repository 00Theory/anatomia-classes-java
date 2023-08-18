package EstruturaDados.pilhas;

public class Main {

    public static void main(String[] args) {

        Pilhas minhaPilha = new Pilhas();
        minhaPilha.push(new NoPilha(1));
        minhaPilha.push(new NoPilha(2));
        minhaPilha.push(new NoPilha(3));
        minhaPilha.push(new NoPilha(4));
        minhaPilha.push(new NoPilha(5));
        minhaPilha.push(new NoPilha(6));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());

        minhaPilha.push(new NoPilha(99));

        System.out.println(minhaPilha);
    }
}
