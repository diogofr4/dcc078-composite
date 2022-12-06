import java.util.ArrayList;
import java.util.List;

public class Album extends Conteudo{
    private List<Conteudo> conteudos;

    public Album(String descricao, String nome) {
        super(descricao, nome);
        this.conteudos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }

    @Override
    public String getConteudo() {
        String saida = "";
        saida = "Album: " + this.getNome() + " - Descricao: " + this.getDescricao() + "\n";
        for (Conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}
