package EstruturaDados.listas;

public class NoListaEncadeada<T> {
    
    private T conteudo;
    private NoListaEncadeada proximoNoListaEncadeada;
    
    public NoListaEncadeada() {
        this.proximoNoListaEncadeada = null;
    }

    public NoListaEncadeada(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoListaEncadeada(T conteudo, NoListaEncadeada proximoNoListaEncadeada) {
        this.conteudo = conteudo;
        this.proximoNoListaEncadeada = proximoNoListaEncadeada;
    }

    public T getConteudo() {
        return conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public NoListaEncadeada getProximoNoListaEncadeada() {
        return proximoNoListaEncadeada;
    }
    public void setProximoNoListaEncadeada(NoListaEncadeada proximoNoListaEncadeada) {
        this.proximoNoListaEncadeada = proximoNoListaEncadeada;
    }

    @Override
    public String toString() {
        return "NoListaEncadeada [conteudo=" + conteudo + "]";
    }

    public String toStringEncadeado(){
        String str = "NoListaEncadeada [conteudo=" + conteudo + "]";

        if (proximoNoListaEncadeada != null){
            str += "->" + proximoNoListaEncadeada.toString();
        }
        else{
            str += "->null";
        }
        return str;
    }
    
}
