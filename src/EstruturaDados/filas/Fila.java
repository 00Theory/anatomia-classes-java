package EstruturaDados.filas;

public class Fila<T> {
    

    private NoFila<T> refNoEntrada;

    public Fila() {
        this.refNoEntrada = null;
    }

    public void enqueue(T object){
        NoFila<T> novoNo = new NoFila<>(object);
        novoNo.setProximoNoFila(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public T first(){
        if (!this.isEmpty()){
            NoFila<T> primeiroNo = refNoEntrada;
            while (true){
                if (primeiroNo.getProximoNoFila() != null){
                    primeiroNo = primeiroNo.getProximoNoFila();
                }
                else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!isEmpty()){
            NoFila<T> primeiroNo = refNoEntrada;
            NoFila<T> noAuxiliar = refNoEntrada;
            while (true){
                if (primeiroNo.getProximoNoFila() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getProximoNoFila();
                }
                else{
                    noAuxiliar.setProximoNoFila(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntrada == null? true: false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila<T> noAuxiliar = refNoEntrada;

        if (refNoEntrada != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getProximoNoFila() != null){
                    noAuxiliar = noAuxiliar.getProximoNoFila();
                }
                else{
                    stringRetorno += "null";
                    break;
                }
            }
        }
        else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }

    

}