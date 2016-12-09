/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.sql.PreparedStatement;//classe para o sql
import java.sql.ResultSet;//comunicação entre aplicações sgbd
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;//tratamento de exceção em login
import java.util.logging.Logger;//tratamento de login

/**
 *
 * @author Wallison
 */
public class DAOAdministrador extends DAO{
    private DAO dao;
    @Override
    public void insert(Object element) {//depena objeto
        Administrador administrador = (Administrador) element;
        String sql = "INSERT INTO administrador(`cod_organizador`,nome, sexo) VALUES(?,?,'m')";
        
        PreparedStatement stmt;
        try {
            stmt = Conn.getInstance().getConnection().prepareStatement(sql);
            stmt.setLong(0, administrador.getOrganizador().getCodOrganizador());//?????? acho que é do banco de dados
            stmt.execute();
        } catch (SQLException ex) {
            //Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList select(String seletion) {
        String sql = "SELECT * FROM administrador WHERE "+seletion;
        ArrayList<Administrador> administradores = new ArrayList<>();
        try{
            PreparedStatement stmt = Conn.getInstance().getConnection().prepareStatement(sql);
            stmt.executeQuery();// função que capta
            ResultSet rs = stmt.executeQuery(sql);//recebe o resulta
            while(rs.next()){
                long codAdministrador = rs.getLong("cod_administrador");
                long codOrganizador = rs.getLong("cod_organizador");
                
                dao = new DAOOrganizador();
                Organizador organizador = (Organizador)this.dao.select("cod_organizador="+codOrganizador).get(0);
                
                administradores.add(new Administrador(codAdministrador, organizador));
            }
            return administradores;
        }catch(SQLException ex){
            return null;
        } catch (NegativeNumberException ex) {
            Logger.getLogger(DAOParticipante.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void update(Object object, String selection) {
        dao = new DAOOrganizador();
        this.dao.update(object, selection);
    }
}
