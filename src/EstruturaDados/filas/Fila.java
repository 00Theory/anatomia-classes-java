package EstruturaDados.filas;

public class Fila{
    

    private NoFila refNoEntrada;

    public Fila() {
        this.refNoEntrada = null;
    }

    public void enqueue(NoFila novoNo){
        novoNo.setProximoNoFila(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public NoFila first(){
        if (!this.isEmpty()){
            NoFila primeiroNo = refNoEntrada;
            while (true){
                if (primeiroNo.getProximoNoFila() != null){
                    primeiroNo = primeiroNo.getProximoNoFila();
                }
                else{
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public NoFila dequeue(){
        if (!isEmpty()){
            NoFila primeiroNo = refNoEntrada;
            NoFila noAuxiliar = refNoEntrada;
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
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntrada == null? true: false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAuxiliar = refNoEntrada;

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