package EstruturaDados.lista_circular;

public class ListaCircular<T> {
    
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanholista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanholista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanholista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoPosterior(cauda);
        }
        else{
            novoNo.setNoPosterior(this.cauda);
            this.cabeca.setNoPosterior(novoNo);
            this.cauda = novoNo;
        }

        this.tamanholista++;
    }

    public void remove(int index){
        if (index >= this.tamanholista){
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");
        }
        No <T> noAux = this.cauda;

        if (index == 0){
            this.cauda = this.cauda.getNoPosterior();
            this.cabeca.setNoPosterior(this.cauda);
        }
        else if (index == 1){
            this.cauda.setNoPosterior(this.cauda.getNoPosterior().getNoPosterior());
        }
        else{
            for (int i = 0; i < index - 1; i++){
                noAux = noAux.getNoPosterior();
            }
            noAux.setNoPosterior(noAux.getNoPosterior().getNoPosterior());
        }

        this.tamanholista--;

    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if (index == 0){
            return this.cauda;
        }

        if (index == size() - 1){
            return this.cabeca;
        }

        No<T> noAux = this.cauda;
        for (int i = 0; (i < index) && (noAux != null); i++){
            noAux = noAux.getNoPosterior();
        }

        return noAux;
    }

    public boolean isEmpty(){
        return this.tamanholista == 0 ? true : false;
    }

    public int size(){
        return tamanholista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAux = this.cauda;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No {conteúdo = " + noAux.getConteudo()+ "}] -->\n";
            noAux = noAux.getNoPosterior();
        }

        strRetorno += this.size() != 0 ? "(Retorna ao início)" : "[0 - Vazio]";

        return strRetorno;
    }

    
}
