package br.com.stockplus.dao;

import br.com.stockplus.connection.ConnectionUtil;
import br.com.stockplus.entity.UsuarioEntity;

public class UsuarioDAO {
    private void insert(UsuarioEntity usuarioEntity){
        try {
            var connecction = ConnectionUtil.getConnection();
            var statemente = connecction.prepareStatement("null");


            /////


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void update(UsuarioEntity usuarioEntity){
        try{
            var connection = ConnectionUtil.getConnection();
            var statemente = connection.prepareStatement("null");


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
