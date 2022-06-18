package com.dashboard.vendas.services;

import com.dashboard.vendas.dto.SellerDTO;
import com.dashboard.vendas.entities.Seller;
import com.dashboard.vendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll(){
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }

}
