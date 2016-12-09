/**
 *
 * @author Davidson
 */
package telas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;//java.swing.JFrame e javax.swing,JLabel


public class Apresentacao extends JFrame{//JFrame é uma classe java que cria a tela para desenhos, botoes e menus.
    //representa uma janela

    //declaracao dos elementos
    private JLabel idUsuario, id; //são rotulos ou slogans para exibir frames. Tem o metodo setText(String)
    //altera o texto e getText() que retorna o texto atual.
    private JTextField usuario;// um dos principais elementos graficos do java. Campo para o usuario colocar
    //texto em uma linha. setText(String)-> altera o texto e getText()->retorna o texto atual.
    private JPasswordField txtId;//campo de texto protegido. Subclasse JTextField. Retorna texto atual.
    private JButton ok, cancelar;//declara botoes para executar acoes
    
    public Apresentacao(){
        setTitle("Sistema do RU");
        setSize(400,300);//tamanho da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para fazer o JFrame comportar-se como uma instancia de frame?
        setLayout(null);//container basico para inserir, JPainel com metodo add(Component, int) e setLayout(LayouManager)-> altera o tipo de layout
        setLocationRelativeTo(null);//posiciona o JFrame. Sempre depois do setSize. Declarcao de tamanho.
    
        //criando componentes
        idUsuario=new JLabel ("Usuario:");//instanciando o atributo e escreve na tela
        usuario=new JTextField ();
        id=new JLabel("Senha:");
        txtId=new JPasswordField();
        ok=new JButton("OK");
        cancelar=new JButton("Cancelar");
        
        //link dos componentes
        
        add(idUsuario);// JPainel add(componente, int)
        add(usuario);
        add(id);
        add(txtId);
        add(ok);
        add(cancelar);
        
        //posicoes de todos, coordenadas
        //rotulos
        idUsuario.setBounds(100,50,100,25);//X, Y, Width (largura) e Height(Altura)
        usuario.setBounds(200,50,150,25);
        
        //caixa de txt
        id.setBounds(100,80,100,25);
         
        //caixa para senha
        txtId.setBounds(200,80,150,25);
 
       //botoes
       ok.setBounds(100,110,100,25);
       cancelar.setBounds(200,110,150,25);
        
       // acoes dos botoes
       ok.addActionListener(new ActionListener(){//porque esse metodo nao fecha o parenteses ?
           //metodo já implementado para adicionar acao que recebe um obj ouvidor 
           public void actionPerformed(ActionEvent evt){//?
                okEvento(evt);
            }
        });
        cancelar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               cancelarEvento(evt);
           }
        });// ? muito esquisito fechar a chave e depois o parenteses?
    }
    private void okEvento(ActionEvent evt){
        Principal principal=new Principal();
        principal.setLocationRelativeTo(null);//apaga posicao atual
        principal.setVisible(true); //vai para a segunda tela, a entrada do programa
        this.dispose();//acabando libera a memoria
    }
    
    private void cancelarEvento(ActionEvent evt){
        System.exit(0);
    }
    
}