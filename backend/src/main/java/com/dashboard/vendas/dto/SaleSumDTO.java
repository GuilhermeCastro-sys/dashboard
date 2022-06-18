package com.dashboard.vendas.dto;

import com.dashboard.vendas.entities.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {

    private String SellerName;
    private Double sum;

    public SaleSumDTO(){

    }

    public SaleSumDTO(Seller seller, Double sum) {
        SellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setSellerName(String sellerName) {
        SellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
