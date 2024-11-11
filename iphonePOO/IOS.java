package iphonePOO;

import iphonePOO.src.Internet.safari;
import iphonePOO.src.Voice.phone;
import iphonePOO.src.iTunes.music;

public class IOS {
    public static void main(String[] args) {
        String UsuariIPHONE = "Usuario no Metrô indo ao trabalho com seu Iphone";
        System.out.println(UsuariIPHONE);
        phone phoneIOS = new phone();
        phoneIOS.ConectarWhatsapp();
        String Mensagem = "Usuario Iphone contactado seus contatos pelo Whatsapp";
        System.out.println(Mensagem);

        music musicIOS = new music();
        musicIOS.tocarPlayList();
        String Mensagem2 = "Após chamada de video, usario seleciona playlist e ouve com os phone de ouvido sua musicas favoritas";
        System.out.println(Mensagem2);

        safari safariIOS = new safari();
        safariIOS.acessandoEcommerce();
        String Mensagem3 = "Usuario Iphone acessando ecommerce enquanto ouve musicas e envia msg para contatos privativos pelo Whatsapp";
        System.out.println(Mensagem3);

    }
}
