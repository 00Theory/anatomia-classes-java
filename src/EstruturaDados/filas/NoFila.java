package EstruturaDados.filas;

public class NoFila {
    
    private Object object;
    private NoFila proximoNoFila;

    public NoFila getProximoNoFila() {
        return proximoNoFila;
    }

    public void setProximoNoFila(NoFila proximoNoFila) {
        this.proximoNoFila = proximoNoFila;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public NoFila() {
    }

    public NoFila(Object object) {
        this.proximoNoFila = null;
        this.object = object;
    }

    @Override
    public String toString() {
        return "NoFila [object=" + object + "]";
    }

    
}

    
