package Interface;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import Interface.Images.Images;

public class Produto {
    Images imagens = new Images();

    private Label layout = new Label(imagens.getLayoutProdutos(), 0, 0, 155, 155);
    private Botão carrinho = new Botão(imagens.getCarrinho(), 119, 125, 26, 25);
    private String nome;

    public Produto(String pathProduto, String Nome, String preço){
        this.layout.getLabel().add(this.carrinho.getBotão());
        this.nome = Nome;

        Label produto = new Label(pathProduto, 13, 13, 129, 104);
        JLabel nomeProduto = new JLabel(nome);
        nomeProduto.setBounds(9, 124, 110, 15);nomeProduto.setForeground(new Color(255,255,255));
        nomeProduto.setFont(new Font("Montserrat", 1, 12));
        JLabel preçoProduto = new JLabel(String.format("R$ %s", preço));
        preçoProduto.setBounds(9, 139, 80, 10);preçoProduto.setForeground(new Color(255,255,255));
        preçoProduto.setFont(new Font("Montserrat", 1, 10));

        this.layout.getLabel().add(produto.getLabel());
        this.layout.getLabel().add(nomeProduto);
        this.layout.getLabel().add(preçoProduto);
    }

    public String getNome() {
        return nome;
    }

    public JLabel getLayout() {
        return this.layout.getLabel();
    }

    @Override
    public String toString() {
        return getNome();
    }

    public Object compareTo(Produto o2) {
        return null;
    }
}
