public class Imagem extends Conteudo{
    private String caminhoImagem;

    public Imagem(String descricao, String nome, String caminhoImagem) {
        super(descricao, nome);
        this.caminhoImagem = caminhoImagem;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    @Override
    public String getConteudo() {
        return "Imagem Caminho: " + this.getCaminhoImagem() + " - Nome: " + this.getNome() + " - Descrição:" + this.getDescricao() + "\n";
    }
}
