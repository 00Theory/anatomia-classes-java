package EstruturaDados.filas;

public class NoFila<T>{
    
    private T object;
    private NoFila<T> proximoNoFila;

    public NoFila<T> getProximoNoFila() {
        return proximoNoFila;
    }

    public void setProximoNoFila(NoFila<T> proximoNoFila) {
        this.proximoNoFila = proximoNoFila;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoFila() {
    }

    public NoFila(T object) {
        this.proximoNoFila = null;
        this.object = object;
    }

    @Override
    public String toString() {
        return "NoFila [object=" + object + "]";
    }

    
}

    
