package br.com.stockplus.dao;

import br.com.stockplus.connection.ConnectionUtil;
import br.com.stockplus.entity.ProdutoEntity;

public class ProdutoDAO {
    public static ProdutoEntity entity = new ProdutoEntity();


    private String insert(){
        ProdutoEntity entity = new ProdutoEntity();

        var code = entity.getCodIdent();

        try {
            var connection = ConnectionUtil.getConnection();
            var statemente = connection.prepareStatement("null");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return code;
    }

    private void update(String code){
        try {
            var connetion = ConnectionUtil.getConnection();
            var statemente = connetion.prepareStatement("null");


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void delete(String code){
        try {
            var connection = ConnectionUtil.getConnection();
            var statemente = connection.prepareStatement("null");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private ProdutoEntity readOneProduc(String code){
        ProdutoEntity entity = new ProdutoEntity();

        try {
            var connection = ConnectionUtil.getConnection();
            var statemente = connection.prepareStatement("null");

        }catch (Exception e){
            e.printStackTrace();
        }

        return entity;
    }

    private ProdutoEntity readAlL(){
        ProdutoEntity entity = new ProdutoEntity();

        try {
            var connection = ConnectionUtil.getConnection();
            var statemente = connection.prepareStatement("null");



        }catch (Exception e){
            e.printStackTrace();
        }

        return  entity;
    }
}
