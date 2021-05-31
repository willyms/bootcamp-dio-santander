package com.project.bootcamp.repository;

import com.project.bootcamp.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.time.*;
import java.util.*;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

    Optional<Stock> findByNameAndDate(String name, LocalDate date);

    @Query("SELECT s FROM Stock s WHERE s.name = :name AND s.date = :date AND s.id <> :id ")
    Optional<Stock> findByStockUpdate(Long id, String name, LocalDate date);

    @Query("SELECT s FROM Stock s WHERE s.date = :date")
    List<Stock> findByToday(LocalDate date);
}
