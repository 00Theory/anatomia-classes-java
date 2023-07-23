package estudar.marco.metodos;

import java.util.random.RandomGenerator;

public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void LigarTv(){
        ligada = true;
    }

    public void AumentarVolume(){
        volume += 5;
    }

    public void DiminuirVolume(){
        volume -= 5;
    }

    public void TrocarCanal(){
        canal += RandomGenerator.getDefault().nextInt(-1, 2);
    }
}
