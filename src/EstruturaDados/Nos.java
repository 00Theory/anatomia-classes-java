package EstruturaDados;

public class Nos {
    private String conteudo;
    private Nos proximoNo;

    public Nos(String conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Nos getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(Nos proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "Nos [conteudo=" + conteudo + "]";
    }
}
