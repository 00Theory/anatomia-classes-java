package EstruturaDados.lista_duplamente_encadeada;

public class ListaDuplamenteEncadeada<T> {
    
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoPosterior(null); //Pois não tem ninguem a frente dele
        novoNo.setNoAnterior(ultimoNo);

        // Testes de nós existentes
        if(primeiroNo == null){
            primeiroNo = novoNo; // o primeiro nó ser nulo, quer dizer que há um espaço para o nó atual ser o primeiro
        }

        if (ultimoNo != null){
            ultimoNo.setNoPosterior(novoNo); //último nó referenciando o no atual como próximo
        }

        ultimoNo = novoNo; //Todo elemento incrementado vai ao final da lista
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoPosterior(noAuxiliar);

        if (novoNo.getNoPosterior() != null){
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getNoPosterior().setNoAnterior(novoNo);
        }
        else{
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0){
            primeiroNo = novoNo;
        }
        else{
            novoNo.getNoAnterior().setNoPosterior(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index){
        if (index == 0){
            primeiroNo = primeiroNo.getNoPosterior();
            if (primeiroNo != null){
                primeiroNo.setNoAnterior(null);
            }
        }
        else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setNoPosterior(noAuxiliar.getNoPosterior());
            if (noAuxiliar != ultimoNo){
                noAuxiliar.getNoPosterior().setNoAnterior(noAuxiliar.getNoAnterior());
            }
            else{
                ultimoNo = noAuxiliar;
            }
        }

        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoPosterior();
        }

        return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "No {conteúdo = " + noAuxiliar.getConteudo() + " } --> ";
            noAuxiliar = noAuxiliar.getNoPosterior();
        }
            strRetorno += "null";
        return strRetorno;
    }

    
}
