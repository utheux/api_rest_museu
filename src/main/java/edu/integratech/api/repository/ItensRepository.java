package edu.integratech.api.repository;

import edu.integratech.api.dto.ItemDTO;
import edu.integratech.api.model.Item;
import jakarta.persistence.Entity;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ItensRepository extends JpaRepository<Item, Long> {
    Optional<ItemDTO> findByNomeContainingIgnoreCase(String nomeItem);

}
