public class Galeria {
    private Conteudo albuns;

    public void setAlbuns(Conteudo albuns){
        this.albuns = albuns;
    }

    public String getAlbuns() {
        if (this.albuns == null) {
            throw new NullPointerException("Galeria sem fotos");
        }
        return this.albuns.getConteudo();
    }
}
