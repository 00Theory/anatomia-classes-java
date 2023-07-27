package Equipamentos.Multifuncional;

import Equipamentos.Copiar.Copiadora;
import Equipamentos.Digitalizar.Digitalizadora;
import Equipamentos.Impressao.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    @Override
    public void imprimir() {
        System.out.println("Imprimindo com o Equipamento Multifuncional");
    }

    @Override
    public void digitalizar() {
       System.out.println("Digitalizando com o Equipamento Multifuncional");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando com o Equipamento Multifuncional");
    }
    
}
