import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class GaleriaTest {
    @Test
    void deveRetornarAlbunsGaleria() {
        Album ferias = new Album("Férias em Arraial","Férias 2019");
        Imagem praia = new Imagem("", "Praia","../praia.jpg");
        ferias.addConteudo(praia);

        Album formatura = new Album("Formatura","Formatura 2021");
        Imagem diploma = new Imagem("Recebendo diploma", "Diploma", "../diploma.jpg");
        formatura.addConteudo(diploma);

        Album lembrancas = new Album("Melhores lembranças","Lembranças");
        lembrancas.addConteudo(ferias);
        lembrancas.addConteudo(formatura);

        Galeria galeria = new Galeria();
        galeria.setAlbuns(lembrancas);

        assertEquals("Album: Lembranças - Descricao: Melhores lembranças\n" +
                "Album: Férias 2019 - Descricao: Férias em Arraial\n" +
                "Imagem Caminho: ../praia.jpg - Nome: Praia - Descrição:\n" +
                "Album: Formatura 2021 - Descricao: Formatura\n" +
                "Imagem Caminho: ../diploma.jpg - Nome: Diploma - Descrição:Recebendo diploma\n", galeria.getAlbuns());
    }

    @Test
    void deveRetornarExcecaoGaleriaSemFoto() {
        try {
            Galeria galeria = new Galeria();
            galeria.getAlbuns();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Galeria sem fotos", e.getMessage());
        }
    }
}
