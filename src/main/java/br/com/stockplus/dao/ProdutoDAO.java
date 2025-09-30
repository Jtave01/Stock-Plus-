package br.com.stockplus.dao;

import br.com.stockplus.connection.ConnectionUtil;
import br.com.stockplus.entity.ProdutoEntity;

public class ProdutoDAO {
    public static ProdutoEntity entity = new ProdutoEntity();

    public static void main(String[] args) {
        entity.getId();

        ProdutoDAO produtoDAO = new ProdutoDAO();

        produtoDAO.update(entity.getId());
    }

    private void insert(String code){
        try {
            var connection = ConnectionUtil.getConnection();
            var statemente = connection.prepareStatement("null");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void update(Long id){
        try {
            var connetion = ConnectionUtil.getConnection();
            var statemente = connetion.prepareStatement("null");


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void delete(String code){
        try {

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
