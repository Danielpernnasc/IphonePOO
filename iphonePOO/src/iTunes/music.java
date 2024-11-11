package iphonePOO.src.iTunes;

public class music {

    protected void lookAppItune() {
        System.out.println("Localizando e ativando o Itunes");
    }

    protected void selecionarPlayList() {
        lookAppItune();
        System.out.println("musicas selecionada");
    }

    @SuppressWarnings("unused")
    private void choideMusic() {
        System.out.println("Genero de Musicas. MPB, Samba, Sertanejo Universitário e Pop Rock");
    }

    @SuppressWarnings("unused")
    private void playlistCreated() {
        System.out.println("Playlist criada com sucesso");
    }

    public void tocarPlayList() {
        selecionarPlayList();
        System.out.println("Play --- Music Run");
    }
}
