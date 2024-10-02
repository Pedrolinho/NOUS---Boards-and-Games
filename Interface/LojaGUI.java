package Interface;

import Interface.Images.*;
import Login.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LojaGUI extends JFrame {

    Images imagens = new Images();

    public LojaGUI() {
        // Título da janela
        setTitle("Sistema Loja");

        // Tamanho da janela e config. não redimensionável
        setSize(390, 720);
        setResizable(false);
        setUndecorated(true);

        // Inicia a janela ao centro da tela
        setLocationRelativeTo(null);

        // Torna a janela visível
        setVisible(true);     

        // Inicializa os componentes
        splashScreen();
        iniciar();
    }

    // Telas
    private void splashScreen() {
        JLabel splashscreen = new JLabel();

<<<<<<< HEAD
        splashscreen.setIcon(new ImageIcon("./Interface/Images/Telas/Splashscreen.png"));
=======
        splashscreen.setIcon(new ImageIcon(imagens.getSplaashScreen()));
>>>>>>> 8f19cdcd85c7c802a1f66981e5c3f56b8cbce683
        add(splashscreen);
        splashscreen.setBounds(0, 0, 390, 720);

        try { Thread.sleep (2000); } catch (InterruptedException ex) {}

        splashscreen.setVisible(false);
    }

    public void iniciar() {
        // Label principal
        JLabel iniciar = new JLabel();

        // Botão Iniciar Sessão
        Botão iniciarsessão = new Botão(imagens.getIniciarSessão(), 31, 472, 328, 60);

        iniciarsessão.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iniciarSessãoMouseReleased(evt, iniciar);
            }
        });
        iniciar.add(iniciarsessão.getBotão());

        // Botão Criar Conta
        Botão criarconta = new Botão(imagens.getCriarConta(), 31, 545, 328, 60);
        criarconta.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                criarConta1MouseReleased(evt, iniciar);
            }
        });
        iniciar.add(criarconta.getBotão());

        // Botão Fechar Sistema
        Botão fechar = new Botão(imagens.getFechar(), 345, 30, 17, 17);
        fechar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fecharMouseReleased(evt);
            }
        });
        iniciar.add(fechar.getBotão());
        

<<<<<<< HEAD
        iniciar.setIcon(new ImageIcon("./Interface/Images/Telas/Iniciar.png"));
=======
        iniciar.setIcon(new ImageIcon(imagens.getIniciar()));
>>>>>>> 8f19cdcd85c7c802a1f66981e5c3f56b8cbce683
        add(iniciar);
        iniciar.setBounds(0, 0, 390, 720);


        pack();
    }

    public void iniciarSessão(JLabel iniciar) {
        iniciar.setVisible(false);

        JLabel iniciarsessão = new JLabel();

        JTextField CPF = new JTextField("CPF");
        JPasswordField SENHA = new JPasswordField("SENHA");
        JLabel menssagem = new JLabel("");

        // Campo de texto CPF
        iniciarsessão.add(CPF);
        CPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMouseReleased(evt, CPF);
            }
        });
        CPF.setBounds(54, 267, 282, 17);      
        CPF.setFont(new Font("Roboto", 0, 14));
        CPF.setForeground(new Color(126,126,126));
        CPF.setBackground(new Color(210,210,210));
        CPF.setBorder(null);

        // Campo de texto Senha
        iniciarsessão.add(SENHA);
        SENHA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordMouseReleased(evt, SENHA);
            }
        });
        SENHA.setBounds(54, 348, 282, 17);      
        SENHA.setFont(new Font("Roboto", 0, 14));
        SENHA.setForeground(new Color(126,126,126));
        SENHA.setBackground(new Color(210,210,210));
        SENHA.setBorder(null);
        SENHA.setEchoChar((char) 0);

        // Campo de texto login
        iniciarsessão.add(menssagem);
        menssagem.setBounds(0, 427, 390, 13);      
        menssagem.setHorizontalAlignment(SwingConstants.CENTER);      
        menssagem.setFont(new Font("Roboto", 0, 10));
        menssagem.setForeground(new Color(126,126,126));
        menssagem.setBackground(new Color(168,188,189));
        menssagem.setBorder(null);

        // Botão fechar
        Botão fechar = new Botão(imagens.getFechar(), 345, 30, 17, 17);
        fechar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fecharMouseReleased(evt);
            }
        });
        iniciarsessão.add(fechar.getBotão());

        // Botão voltar
        Botão voltar =  new Botão(imagens.getVoltar(), 30, 30, 8, 15);
        voltar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                voltarMouseReleased(evt, iniciarsessão, iniciar);
            }
        });
        iniciarsessão.add(voltar.getBotão());

        // Botão seguir
        Botão avançar = new Botão(imagens.getAvançar(), 145, 482, 100, 100);
        avançar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logarMouseReleased(evt, iniciarsessão, CPF, SENHA, menssagem);
            }
        });
        iniciarsessão.add(avançar.getBotão());

        // Botão criar conta
        Botão criarconta = new Botão(imagens.getCriarContaString(), 154, 631, 82, 15);
        criarconta.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                criarConta1MouseReleased(evt, iniciarsessão);
            }
        });
        iniciarsessão.add(criarconta.getBotão());

<<<<<<< HEAD
        iniciarsessão.setIcon(new ImageIcon("./Interface/Images/Telas/Iniciar Sessão.png"));
=======
        iniciarsessão.setIcon(new ImageIcon(imagens.getIniciarASessão()));
>>>>>>> 8f19cdcd85c7c802a1f66981e5c3f56b8cbce683
        add(iniciarsessão);
        iniciarsessão.setBounds(0, 0, 390, 720);

        pack();
    }

    public void criarConta1(JLabel iniciar) {
        iniciar.setVisible(false);

        JLabel criarConta1 = new JLabel();

        JTextField NOME = new JTextField("NOME");
        JTextField CPF = new JTextField("CPF");
        JLabel menssagem = new JLabel("");

        // Campo de texto Nome
        criarConta1.add(NOME);
        NOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMouseReleased(evt, NOME);
            }
        });
        NOME.setBounds(54, 267, 282, 17);      
        NOME.setFont(new Font("Roboto", 0, 14));
        NOME.setForeground(new Color(126,126,126));
        NOME.setBackground(new Color(210,210,210));
        NOME.setBorder(null);

        // Campo de texto CPF
        criarConta1.add(CPF);
        CPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMouseReleased(evt, CPF);
            }
        });
        CPF.setBounds(54, 348, 282, 17);      
        CPF.setFont(new Font("Roboto", 0, 14));
        CPF.setForeground(new Color(126,126,126));
        CPF.setBackground(new Color(210,210,210));
        CPF.setBorder(null);

        // Mensagem
        criarConta1.add(menssagem);
        menssagem.setBounds(0, 450, 390, 13);     
        menssagem.setHorizontalAlignment(SwingConstants.CENTER); 
        menssagem.setFont(new Font("Roboto", 0, 10));
        menssagem.setForeground(new Color(126,126,126));
        menssagem.setBackground(new Color(168,188,189));
        menssagem.setBorder(null);

        // Botão fechar
        Botão fechar = new Botão(imagens.getFechar(), 345, 30, 17, 17);
        fechar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fecharMouseReleased(evt);
            }
        });
        criarConta1.add(fechar.getBotão());

        // Botão voltar
        Botão voltar = new Botão(imagens.getVoltar(), 30, 30, 8, 15);
        voltar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                voltarMouseReleased(evt, criarConta1, iniciar);
            }
        });
        criarConta1.add(voltar.getBotão());

        // Botão avançar
        Botão avançar = new Botão(imagens.getAvançar(), 145, 482, 100, 100);
        avançar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                criarConta2MouseReleased(evt, criarConta1, NOME.getText(), CPF.getText(), menssagem);
            }
        });
        criarConta1.add(avançar.getBotão());

<<<<<<< HEAD
        criarConta1.setIcon(new ImageIcon("./Interface/Images/Telas/Cadastro1.png"));
=======
        criarConta1.setIcon(new ImageIcon(imagens.getCadastro1()));
>>>>>>> 8f19cdcd85c7c802a1f66981e5c3f56b8cbce683
        add(criarConta1);
        criarConta1.setBounds(0, 0, 390, 720);

        pack();
    }

    public void criarConta2(JLabel criarConta1, String NOME, String CPF) {
        criarConta1.setVisible(false);

        JLabel criarConta2 = new JLabel();

        JPasswordField Senha1 = new JPasswordField("DIGITE A SENHA");
        JPasswordField Senha2 = new JPasswordField("CONFIRME A SENHA");
        JLabel menssagem = new JLabel("");

        // Campo de texto digitar senha
        criarConta2.add(Senha1);
        Senha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordMouseReleased(evt, Senha1);
            }
        });
        Senha1.setBounds(54, 267, 232, 17);      
        Senha1.setFont(new Font("Roboto", 0, 14));
        Senha1.setForeground(new Color(126,126,126));
        Senha1.setBackground(new Color(210,210,210));
        Senha1.setBorder(null);
        Senha1.setEchoChar((char) 0);

        // Campo de texto confirmar senha
        criarConta2.add(Senha2);
        Senha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordMouseReleased(evt, Senha2);
            }
        });
        Senha2.setBounds(54, 348, 232, 17);      
        Senha2.setFont(new Font("Roboto", 0, 14));
        Senha2.setForeground(new Color(126,126,126));
        Senha2.setBackground(new Color(210,210,210));
        Senha2.setBorder(null);
        Senha2.setEchoChar((char) 0);

        // Menssagem
        criarConta2.add(menssagem);
        menssagem.setBounds(0, 427, 390, 13);      
        menssagem.setHorizontalAlignment(SwingConstants.CENTER);
        menssagem.setFont(new Font("Roboto", 0, 10));
        menssagem.setForeground(new Color(126,126,126));
        menssagem.setBackground(new Color(168,188,189));
        menssagem.setBorder(null);

        // Botão fechar
        Botão fechar = new Botão(imagens.getFechar(), 345, 30, 17, 17);
        fechar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fecharMouseReleased(evt);
            }
        });
        criarConta2.add(fechar.getBotão());

        // Botão voltar
        Botão voltar = new Botão(imagens.getVoltar(), 30, 30, 8, 15);
        voltar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                voltarMouseReleased(evt, criarConta2, criarConta1);
            }
        });
        criarConta2.add(voltar.getBotão());

        // Botão Mostrar Senha
        Botão mostrar1 = new Botão(imagens.getMostrarSenha(), 304, 264, 36, 20);

        mostrar1.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarSenhaMouseEntered(evt, Senha1);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                esconderSenhaMouseExited(evt, Senha1);
            }
        });
        criarConta2.add(mostrar1.getBotão());

        Botão mostrar2 = new Botão(imagens.getMostrarSenha(), 304, 345, 36, 20);
        mostrar2.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarSenhaMouseEntered(evt, Senha2);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                esconderSenhaMouseExited(evt, Senha2);
            }
        });
        criarConta2.add(mostrar2.getBotão());

        // Botão seguir
        Botão avançar = new Botão(imagens.getAvançar(), 145, 482, 100, 100);
        avançar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cadastrarMouseReleased(evt, criarConta2, NOME, CPF, String.valueOf(Senha1.getPassword()), String.valueOf(Senha2.getPassword()), menssagem);
            }
        });
        criarConta2.add(avançar.getBotão());

<<<<<<< HEAD
        criarConta2.setIcon(new ImageIcon("./Interface/Images/Telas/Cadastro2.png"));
=======
        criarConta2.setIcon(new ImageIcon(imagens.getCadastro2()));
>>>>>>> 8f19cdcd85c7c802a1f66981e5c3f56b8cbce683
        add(criarConta2);
        criarConta2.setBounds(0, 0, 390, 720);

        pack();
    }
    
    public void menuPrincipal(JLabel iniciarsessão, List<Produto>produtosList){
        iniciarsessão.setVisible(false);

        JLabel mainmenu = new JLabel();mainmenu.setBounds(0,0,390,720);

        setPreferredSize(new java.awt.Dimension(390, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(390, 720));
        getContentPane().setLayout(null);

        Label menuactivated = new Label(imagens.getMenuActivated(), 0, 0, 230, 720);
        menuactivated.getLabel().setVisible(false);
        menuactivated.getLabel().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuactivatedFocus(evt, menuactivated.getLabel());
            }
        });
        menuactivated.getLabel().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuactivatedUnfocus(evt, menuactivated.getLabel());
            }
        });
        
        Botão changeuser = new Botão(imagens.getChangeUser(), 30, 84, 185, 15);
        changeuser.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuactivatedFocus(evt, menuactivated.getLabel());
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iniciarSessão(mainmenu);
            }

        });
        Botão aboutapp = new Botão(imagens.getAboutApp(), 30, 114, 185, 15);
        aboutapp.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuactivatedFocus(evt, menuactivated.getLabel());
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sobre(mainmenu);
            }
        });

        menuactivated.getLabel().add(changeuser.getBotão());menuactivated.getLabel().add(aboutapp.getBotão());

        JPanel cabeçalho = new javax.swing.JPanel();cabeçalho.setBackground(new Color(168,188,189));        
        JPanel corpo = new javax.swing.JPanel();corpo.setBackground(new Color(168,188,189));        
        JPanel rodapé = new javax.swing.JPanel();rodapé.setBackground(new Color(168,188,189));
        
        cabeçalho.setLayout(null);corpo.setLayout(null);rodapé.setLayout(null);

        Label searchBox = new Label(imagens.getSearchBox(), 30, 70, 296, 30);
        Botão procurar = new Botão(imagens.getProcurar(), 269, 8, 16, 16);
        
        Botão carrinho = new Botão(imagens.getCarrinho(), 333, 72, 26, 25 );
        JTextField procura = new JTextField("O que você procura?");

        Botão fechar = new Botão(imagens.getFechar(), 345, 30, 17, 17);
        fechar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fecharMouseReleased(evt);
            }
        });

        procura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMouseReleased(evt, procura);
            }
        });

        procura.setBounds(8, 8, 140, 14);      
        procura.setFont(new Font("Roboto", 0, 12));
        procura.setForeground(new Color(126,126,126));
        procura.setBackground(new Color(255,255,255));
        procura.setBorder(null);

        Botão menu = new Botão(imagens.getMenu(), 30, 30, 20, 15);
        menu.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuMouseReleased(evt, menuactivated.getLabel(), corpo);
            }
        });

        searchBox.getLabel().add(procurar.getBotão());searchBox.getLabel().add(procura);cabeçalho.add(menu.getBotão());
        cabeçalho.add(searchBox.getLabel());cabeçalho.add(fechar.getBotão());cabeçalho.add(carrinho.getBotão());

        Label produtos = new Label(imagens.getMenuPrincipalBG(), 0, 0, 330, 1604);
        produtos.getLabel().setPreferredSize(new Dimension(330, 1604));
        ModernScrollPane produtosScroll = new ModernScrollPane(produtos.getLabel());produtosScroll.setBackground(new Color(168,188,189));
        produtosScroll.setViewportView(produtos.getLabel());

        Botão combomistério = new Botão(imagens.getComboMistério(), 0, 0, 330, 204);
        produtos.getLabel().add(combomistério.getBotão());
        iniciarProdutos(produtos, produtosList, mainmenu);

        procurar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuPrincipal(mainmenu, filtro(procura.getText()));
                System.out.println("mudou");
            }
        });

        corpo.add(produtosScroll);
        produtosScroll.setBounds(30, 0, 346, 560);
        mainmenu.add(menuactivated.getLabel());mainmenu.add(cabeçalho);mainmenu.add(corpo);mainmenu.add(rodapé);
        cabeçalho.setBounds(0, 0, 390, 140);
        corpo.setBounds(0, 140, 390, 560);
        rodapé.setBounds(0, 700, 390, 20);

        add(mainmenu);
        pack();
    }
    
    public void sobre(JLabel menuprincipal){
        menuprincipal.setVisible(false);

        JLabel sobre = new JLabel();

        // Botão fechar
        Botão fechar = new Botão(imagens.getFechar(), 345, 30, 17, 17);
        fechar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fecharMouseReleased(evt);
            }
        });
        sobre.add(fechar.getBotão());

        // Botão voltar
        Botão voltar = new Botão(imagens.getVoltar(), 30, 30, 8, 15);
        voltar.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                voltarMouseReleased(evt, sobre, menuprincipal);
            }
        });
        sobre.add(voltar.getBotão());

        sobre.setIcon(new ImageIcon(imagens.getSobre()));
        add(sobre);
        sobre.setBounds(0, 0, 390, 720);

        pack();
    }

    // Ações
    private void iniciarSessãoMouseReleased(java.awt.event.MouseEvent evt, JLabel iniciar) {
        iniciarSessão(iniciar);
    } 

    private void criarConta1MouseReleased(java.awt.event.MouseEvent evt, JLabel iniciar) {
        criarConta1(iniciar);
    } 

    private void criarConta2MouseReleased(java.awt.event.MouseEvent evt, JLabel iniciar, String NOME, String CPF, JLabel menssagem) { 
        Verificador verificador = new Verificador(NOME, CPF);
        Login login = new Login();

        System.out.println(NOME);
        
        if(login.procurarUsuário(CPF)){
            menssagem.setText("CPF JÁ CADASTRADO");
            menssagem.setForeground(new Color(255,51,51)); 
            return;
        }
        if(verificador.verificarNome() && NOME.equalsIgnoreCase("NOME") == false){
            if(verificador.verificarCPF() && CPF.equalsIgnoreCase("CPF") == false){
                criarConta2(iniciar, NOME, CPF);    
            }
            else{
                menssagem.setText("CPF INVÁLIDO");
                menssagem.setForeground(new Color(255,51,51));
            }
               
        }
        else{
            menssagem.setText("NOME INVÁLIDO");
            menssagem.setForeground(new Color(255,51,51));
        }
        
    } 

    private void fecharMouseReleased(java.awt.event.MouseEvent evt) {                                     
        System.exit(0);
    }

    private void logarMouseReleased(java.awt.event.MouseEvent evt, JLabel iniciarsessão, JTextField CPF, JTextField SENHA, JLabel menssagem) {   
        Login login = new Login();

        String cpf = CPF.getText();
        String senha = SENHA.getText();

        if(login.verificarUsuário(cpf) == false){
            menssagem.setText("USUÁRIO NÃO ENCONTRADO");
            menssagem.setForeground(new Color(255,51,51));
            return;
        }
        if(login.verificarSenha(cpf, senha) == false){
            menssagem.setText("SENHA INCORRETA");
            menssagem.setForeground(new Color(255,51,51));
            return;
        }
        try { Thread.sleep (1500); } catch (InterruptedException ex) {}

        Produtos produtosList = new Produtos();
        menuPrincipal(iniciarsessão, produtosList.getProdutos());
    }

    private void textMouseReleased(java.awt.event.MouseEvent evt, JTextField x) { 
        String texto = x.getText();

        if(texto.equalsIgnoreCase("CPF") ||
           texto.equalsIgnoreCase("NOME") ||
           texto.equalsIgnoreCase("O que você procura?")){
            x.setText("");
        }
    }

    private void passwordMouseReleased(java.awt.event.MouseEvent evt, JPasswordField x) {
        String senha = String.valueOf(x.getPassword());
        if(senha.equalsIgnoreCase("SENHA") ||
           senha.equalsIgnoreCase("DIGITE A SENHA") ||
           senha.equalsIgnoreCase("CONFIRME A SENHA")){
            x.setText("");    
        }
        x.setEchoChar('*');
        
    }

    private void mostrarSenhaMouseEntered(java.awt.event.MouseEvent evt, JPasswordField x) {
        x.setEchoChar((char) 0);
    }

    private void esconderSenhaMouseExited(java.awt.event.MouseEvent evt, JPasswordField x) {
        x.setEchoChar('*');
    }

    private void cadastrarMouseReleased(java.awt.event.MouseEvent evt, JLabel criarConta2, String NOME, String CPF, String Senha1, String Senha2, JLabel menssagem) {
        Login login = new Login();

        if(Senha1.equals(Senha2) && 
           Senha1.equalsIgnoreCase("DIGITE A SENHA") == false &&
           Senha2.equalsIgnoreCase("CONFIRME A SENHA") == false) {
            if(Senha1.length() < 8){
            menssagem.setText("A SENHA DEVE CONTER PELO MENOS 8 CARACTERES");
            menssagem.setForeground(new Color(255,51,51));
            return;
            }
            login.adicionarUsuário(NOME, CPF, Senha1); iniciarSessão(criarConta2);
        }
        else{
            menssagem.setText("NÃO COMPATÍVEL");
            menssagem.setForeground(new Color(255,51,51));
        }
        
    }

    private void voltarMouseReleased(java.awt.event.MouseEvent evt, JLabel current, JLabel back) {                                     
        current.setVisible(false);
        back.setVisible(true);
    }

    private void iniciarProdutos(Label produtos, List<Produto> produtosList, JLabel mainmenu){
        int [] x = {0, 175};
        int [] y = {224, 399, 574, 749, 924, 1099, 1274, 1449};

        int index;
        for(Produto z : produtosList){
            Botão carrinho = new Botão(imagens.getCarrinho(), 119, 125, 26, 25);
            carrinho.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {

                }
            });

            index = produtosList.indexOf(z);

            int indexx = index % 2;
            int indexy = index / 2;

            int xpos = x[indexx];
            int ypos = y[indexy];

            z.getProductBox().add(carrinho.getBotão());
            z.getProductBox().setBounds(xpos, ypos, 155, 155);

            produtos.getLabel().add(z.getProductBox());
        }
    }

    private void menuMouseReleased(java.awt.event.MouseEvent evt, JLabel menuactivated, JPanel corpo){
        menuactivated.setVisible(true);
    }

    public List<Produto> filtro (String busca){
        Produtos comparar = new Produtos();
        List<Produto> produtosList = new ArrayList<>();

        if(busca.equalsIgnoreCase("O que você procura?")){
            return comparar.getProdutos();
        }
        
        System.out.println(busca);
        
        for(Produto x : comparar.getProdutos()){
            if(x.getNome().toLowerCase().contains(busca.toLowerCase())){
                produtosList.add(x);
            }
        }
        return produtosList;
    }

    private void menuactivatedFocus(java.awt.event.MouseEvent evt, JLabel menuactivated){
        menuactivated.setVisible(true);
    }

    private void menuactivatedUnfocus(java.awt.event.MouseEvent evt, JLabel menuactivated){
        menuactivated.setVisible(false);
    }
    
    public static void main(String[] args) {
        new LojaGUI();
    }
}