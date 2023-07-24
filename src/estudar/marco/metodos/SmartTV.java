package estudar.marco.metodos;


/**
 * 
 * <h1>SmartTV</h1>
 * A SmartTv pode ser desligada ou ligada, além de se poder
 * aumentar ou diminuir o volume dela, também podendo ter os
 * canais dela alterados.
 * 
 * <h2>Métodos:</h2>
 * <h3>LigarTv</h3>
 * <h3>DesligarTv</h3>
 * <h3>AumentarVolume</h3>
 * <h3>DiminuirVolume</h3>
 * 
 * @author Marco Lima
 * @version 1.0
 * @since 23/07/2023
 */
public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void LigarTv(){
        ligada = true;
    }

    public void DesligarTV(){
        ligada = false;
    }

    public void AumentarVolume(){
        volume += 5;
    }

    public void DiminuirVolume(){
        volume -= 5;
    }

    /**
     * <h2>TrocarCanal</h2>
     * Este método TrocarCanal é utilizado para alterar a variável
     * canal por incrementos ou decrementos gerados de maneira
     * aleatória.
     */
    public void TrocarCanal(){
        canal += 1;
    }
}
