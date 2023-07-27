package Mensageiros;

public class FacebookMessenger extends ServicoMensagem {


    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando Mensagem!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem!");
    }
    
}
