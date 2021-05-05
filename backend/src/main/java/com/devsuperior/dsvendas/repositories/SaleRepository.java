package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
