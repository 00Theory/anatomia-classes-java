package EstruturaDados;

public class Nos<T> {
    private T conteudo;
    private Nos<T> proximoNo;

    public Nos(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Nos<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(Nos<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "Nos [conteudo = " + conteudo + "]";
    }
}
