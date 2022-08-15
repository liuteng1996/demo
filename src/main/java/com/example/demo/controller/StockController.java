package com.example.demo.controller;

import com.example.demo.entities.Stock;
import com.example.demo.service.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class StockController {
    @Autowired
    private StockRepository stockRepository;

    @RequestMapping("/saveAndGet")
    public Stock saveAndGet(Stock stock) {
        System.out.println("demo");
        stockRepository.save(stock);
        return stock;
    }

    @RequestMapping("/getByCode")
    public Stock getByCode(String code) {
        return stockRepository.findStockByCode(code);
    }

    @RequestMapping("/getAll")
    public List<Stock> getAll() {
        System.out.println("test!!");
        return stockRepository.findAll();
    }

}
