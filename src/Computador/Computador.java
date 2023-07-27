package Computador;

import Mensageiros.FacebookMessenger;

public class Computador {
    
    public static void main(String[] args) {
        FacebookMessenger facebookMessenger = new FacebookMessenger();
        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();
    }
    

    
}
