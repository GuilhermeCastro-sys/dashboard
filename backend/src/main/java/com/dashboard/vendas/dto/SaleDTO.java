package com.dashboard.vendas.dto;

import com.dashboard.vendas.entities.Sale;

import java.io.Serializable;
import java.time.LocalDate;

public class SaleDTO implements Serializable {

    private Long integer;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO seller;

    public SaleDTO(){

    }

    public SaleDTO(Long integer, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
        this.integer = integer;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }

    public SaleDTO(Sale entity) {
        integer = entity.getInteger();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        seller = new SellerDTO(entity.getSeller());
    }

    public Long getInteger() {
        return integer;
    }

    public void setInteger(Long integer) {
        this.integer = integer;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SellerDTO getSeller() {
        return seller;
    }

    public void setSeller(SellerDTO seller) {
        this.seller = seller;
    }
}
