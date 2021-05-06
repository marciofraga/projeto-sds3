package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.dto.SaleSuccessSumDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT NEW com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))  "
        + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT NEW com.devsuperior.dsvendas.dto.SaleSuccessSumDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))  "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessSumDTO> successGroupedBySeller();
}
