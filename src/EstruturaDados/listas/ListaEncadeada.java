package EstruturaDados.listas;

public class ListaEncadeada<T> {
    
    NoListaEncadeada<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        NoListaEncadeada<T> novoNo = new NoListaEncadeada<>(conteudo);
        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        NoListaEncadeada<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++){
            noAux = noAux.getProximoNoListaEncadeada();
        }

        noAux.setProximoNoListaEncadeada(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private NoListaEncadeada<T> getNo(int index){

        validaIndice(index);

        NoListaEncadeada<T> noAux = referenciaEntrada;
        NoListaEncadeada<T> noRetorno = null;

        for (int i = 0; i <= index; i++){
            noRetorno = noAux;
            noAux = noAux.getProximoNoListaEncadeada();
        }

        return noRetorno;
    }

    public T remove(int index){
        NoListaEncadeada<T> noPivot = this.getNo(index);
        if (index == 0){
            referenciaEntrada = noPivot.getProximoNoListaEncadeada();
            return noPivot.getConteudo();
        }

        NoListaEncadeada<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNoListaEncadeada(noPivot.getProximoNoListaEncadeada());
        // O JVM entende que nada referencia aquele objeto então ele é deletado, já que o nó ante
        // anterior referencia o nó depois do pivot, aquele em que se queria deletar. Ex: nó 2 aponta para o 4
        // então exclui o 3 pois nada referencia ele.
        return noPivot.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        NoListaEncadeada<T> referenciaAux = referenciaEntrada;
        while(true){
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNoListaEncadeada() != null){
                    referenciaAux = referenciaAux.getProximoNoListaEncadeada();
                }
            }
            else{
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){
        if (index >= size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + ".");
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null? true: false;
    }

    @Override
    public String toString() {

        String strRetorno = "";
        NoListaEncadeada<T> noAux = referenciaEntrada;

        for(int i = 0; i< this.size(); i++){
            strRetorno += "No[conteudo=" + noAux.getConteudo() + "]";
            noAux = noAux.getProximoNoListaEncadeada();
        }
        strRetorno += "null";
        
        return strRetorno;
    }

    
}
