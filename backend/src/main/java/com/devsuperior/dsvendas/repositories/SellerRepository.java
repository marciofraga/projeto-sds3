package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
