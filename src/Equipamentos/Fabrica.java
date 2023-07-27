package Equipamentos;

import Equipamentos.Copiar.Copiadora;
import Equipamentos.Copiar.Xerox;
import Equipamentos.Digitalizar.Digitalizadora;
import Equipamentos.Digitalizar.Scanner;
import Equipamentos.Impressao.Deskjet;
import Equipamentos.Impressao.Impressora;
import Equipamentos.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional emf = new EquipamentoMultifuncional();
        Impressora impressora = emf;
        Digitalizadora digitalizadora = emf;
        Copiadora copiadora = emf;

        Impressora impressora2 = new Deskjet();
        impressora2.imprimir();

        Digitalizadora digitalizadora2 = new Scanner();
        digitalizadora2.digitalizar();

        Copiadora copiadora2 = new Xerox();
        copiadora2.copiar();


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
