package br.com.stockplus.entity;

import lombok.Data;

@Data
public class FornecedorEntity {
    private Long id;
    private String cpf;
    private String razaoSocial;
    private String endereco;
    private String numeroEndereco;
    private String telefone;
    private String bairroEndereco;
    private String cidade;
    private String uf;

}
