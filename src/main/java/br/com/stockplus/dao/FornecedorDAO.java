package br.com.stockplus.dao;

import br.com.stockplus.connection.ConnectionUtil;
import br.com.stockplus.entity.FornecedorEntity;

/// -->
public class FornecedorDAO {

    public void insert(FornecedorEntity entity){
        var sql = "INSERT fornecedor (cnpj, razao_social, endereco, numero, telefone, bairro, cidade, uf ) " +
                "values(?, ?, ?, ?, ?, ?, ?, ?)";
        try(var connection = ConnectionUtil.getConnection();
            var statemente = connection.prepareStatement(sql)
        ){
            statemente.setString(1, entity.getCnpj());
            statemente.setString(2, entity.getRazaoSocial());
            statemente.setString(3, entity.getEndereco());
            statemente.setString(4, entity.getNumeroEndereco());
            statemente.setString(5, entity.getTelefone());
            statemente.setString(6, entity.getBairroEndereco());
            statemente.setString(7, entity.getCidade());
            statemente.setString(8, entity.getUf());
            statemente.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Erro ao cadaastrar um fornecedor");
        }
    }

    public FornecedorEntity findByCnpj(String cnpj){
        FornecedorEntity entity = new FornecedorEntity();

        return entity;
    }


}
