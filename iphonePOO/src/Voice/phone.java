package iphonePOO.src.Voice;

public class phone {
    protected void lookAppWhatsapp() {
        System.out.println("Localizando o app Whatsapp");
    }

    protected void sendMsg() {
        System.out.println("Mensagem enviada");
    }

    @SuppressWarnings("unused")
    private void partnerConatact() {
        System.out.println("Ligando para Namorada ou Namorada");
    }

    protected void VideoCall() {
        System.out.println("Chamada de vídeo realizada");
    }

    public void ConectarWhatsapp() {
        lookAppWhatsapp();
        sendMsg();
        VideoCall();
        System.out.println("Usuario --- Online conectado pelo Whatsapp");
    }
}
