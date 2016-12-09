/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Wallison
 */
public abstract class DAO{
    public abstract void insert(Object element);
    public abstract ArrayList select(String seletion);
    public abstract void update(Object object, String selection);
    
    public void delete(String selection){
        Class  classe = this.getClass();// é uma maneira de pegar informações da classe
        String nameClasse = classe.getSimpleName().toLowerCase();// deixa tudo minuscula e pega o nome classe
        String table = "";
        String[] sv = nameClasse.split("dao");
        table = sv[1];
        String sql = "DELETE FROM "+table+" WHERE "+selection; // monta a pesquisa com table=classe, vem o selection       
       //coloca no try a seguir
        try{
            PreparedStatement stmt = Conn.getInstance().getConnection().prepareStatement(sql);   //prepara o comando 
            stmt.execute();//executa a busca
        }catch(SQLException ex){//não deu captura exceção
            
        }

    }
}
