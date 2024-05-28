package edu.integratech.api.dto;

import jakarta.persistence.Column;

public record ItemDTO(Long id, String nome,
                      String dataDeAdesao,
                      String descricao,
                      String dataDeFabricacao,
                      String fabricante,
                      String historia,
                      String estadoDeConservacao) {
}
