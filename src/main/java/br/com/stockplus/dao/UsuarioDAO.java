package br.com.stockplus.dao;

import br.com.stockplus.connection.ConnectionUtil;
import br.com.stockplus.entity.UsuarioEntity;
import br.com.stockplus.graphicalInterface.cadastro.WinCadastrodeUsuario;

public class UsuarioDAO {
    private void insert(UsuarioEntity usuarioEntity){
        WinCadastrodeUsuario cad = new WinCadastrodeUsuario();


        try {
            var connecction = ConnectionUtil.getConnection();
            var statemente = connecction.prepareStatement("null");

            //String username = cad.text;
            ///String nome = winLogin.getText();
          //  String email = winLogin.getText();
           // String password = winLogin.getText();
        //String confirmarSenha = winLogin.getText();

        //    Long idPermissao = (long) (permicoes.getSelectedIndex() + 1);

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
