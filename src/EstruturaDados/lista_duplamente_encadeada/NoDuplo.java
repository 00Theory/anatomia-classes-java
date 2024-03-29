package EstruturaDados.lista_duplamente_encadeada;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noAnterior;
    private NoDuplo<T> noPosterior;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    public NoDuplo<T> getNoPosterior() {
        return noPosterior;
    }

    public void setNoPosterior(NoDuplo<T> noPosterior) {
        this.noPosterior = noPosterior;
    }

    @Override
    public String toString() {
        return "NoDuplo [ conteúdo =" + conteudo + "]";
    }
    
    

}

