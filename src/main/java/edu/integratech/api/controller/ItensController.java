package edu.integratech.api.controller;

import edu.integratech.api.dto.ItemDTO;
import edu.integratech.api.model.Item;
import edu.integratech.api.repository.ItensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/itens")
public class ItensController {

    @Autowired
    private ItensRepository repositorio;

    @GetMapping
    public List<ItemDTO> obterItens(){
        return repositorio.findAll()
                .stream()
                .map(i -> new ItemDTO(i.getId(), i.getNome(),i.getDataDeAdesao(), i.getDescricao(), i.getDataDeFabricacao(), i.getFabricante(), i.getHistoria(),i.getEstadoDeConservacao()))
                .collect(Collectors.toList());

    }

    @GetMapping("/{nome}")
    public Optional<ItemDTO> obterItem(@PathVariable String nome){
        return repositorio.findByNomeContainingIgnoreCase(nome);
    }
}
