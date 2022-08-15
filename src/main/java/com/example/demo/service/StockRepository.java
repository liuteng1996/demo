package com.example.demo.service;

import com.example.demo.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StockRepository extends JpaRepository<Stock, Long> {
    Stock findStockByCode(String code);

}
