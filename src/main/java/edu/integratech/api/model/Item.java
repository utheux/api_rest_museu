package edu.integratech.api.model;

import jakarta.persistence.*;


@Entity
@Table(name = "itens")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataDeAdesao;
    @Column(name = "descricao", columnDefinition = "text")
    private String descricao;
    private String dataDeFabricacao;
    private String fabricante;
    @Column(name = "historia", columnDefinition = "text")
    private String historia;
    private String estadoDeConservacao;

    public Item(){

    }

    public Item(Long id, String nome, String dataDeAdesao, String descricao, String dataDeFabricacao, String fabricante, String historia, String estadoDeConservacao) {
        this.id = id;
        this.nome = nome;
        this.dataDeAdesao = dataDeAdesao;
        this.descricao = descricao;
        this.dataDeFabricacao = dataDeFabricacao;
        this.fabricante = fabricante;
        this.historia = historia;
        this.estadoDeConservacao = estadoDeConservacao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataDeAdesao() {
        return dataDeAdesao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getHistoria() {
        return historia;
    }

    public String getEstadoDeConservacao() {
        return estadoDeConservacao;
    }
}
