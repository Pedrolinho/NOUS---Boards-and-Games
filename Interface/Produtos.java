package Interface;

import java.util.ArrayList;
import java.util.List;
import Interface.Images.Images;

public class Produtos {
    private List<Produto> produtos = new ArrayList<>();
    private Images imagens = new Images();

    // Produtos
    Produto baralho = new Produto(imagens.getBaralho(), "BARALHO", "10,00");
    Produto blackstories = new Produto(imagens.getDarkstories(), "BLACK STORIES", "40,00");
    Produto dixit = new Produto(imagens.getDixit(), "DIXIT", "250,00");
    Produto dobble = new Produto(imagens.getDobble(), "DOBBLE", "50,00");
    Produto historiassinistras = new Produto(imagens.getHistoriassinistras(), "HISTÓRIAS SINISTRAS", "40,00");
    Produto magic = new Produto(imagens.getMagic(), "MAGIC", "15,00");
    Produto master = new Produto(imagens.getMaster(), "MASTER", "80,00");
    Produto monopoly = new Produto(imagens.getMonopoly(), "MONOPOLY", "170,00");
    Produto munchkin = new Produto(imagens.getMunchkin(), "MUNCHKIN", "120,00");
    Produto perfil7 = new Produto(imagens.getPerfil7(), "PERFIL 7", "90,00");
    Produto pokemon = new Produto(imagens.getPokemon(), "POKÉMON", "15,00");
    Produto spookystories = new Produto(imagens.getSpookystories(), "SPOOKY STORIES", "40,00");
    Produto stella = new Produto(imagens.getStella(), "STELLA", "220,00");
    Produto uno = new Produto(imagens.getUno(), "UNO", "10,00");
    Produto warvikings = new Produto(imagens.getWarvikings(), "WAR VIKINGS", "140,00");
    Produto yugioh = new Produto(imagens.getYugioh(), "YU-GI-OH", "15,00");
    
    public Produtos(){
        this.produtos.add(baralho);this.produtos.add(blackstories);this.produtos.add(dixit);this.produtos.add(dobble);
        this.produtos.add(historiassinistras);this.produtos.add(magic);this.produtos.add(master);this.produtos.add(monopoly);
        this.produtos.add(munchkin);this.produtos.add(perfil7);this.produtos.add(pokemon);this.produtos.add(spookystories);
        this.produtos.add(stella);this.produtos.add(uno);this.produtos.add(warvikings);this.produtos.add(yugioh);
        
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
