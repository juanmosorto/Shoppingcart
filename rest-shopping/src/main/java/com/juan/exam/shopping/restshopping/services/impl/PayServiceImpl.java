package com.juan.exam.shopping.restshopping.services.impl;


import com.juan.exam.shopping.restshopping.models.entities.Pay;
import com.juan.exam.shopping.restshopping.repositories.PayRepository;
import com.juan.exam.shopping.restshopping.services.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayServiceImpl implements PayService {
    private final PayRepository payRepository;

    @Autowired
    public PayServiceImpl(PayRepository payRepository) {
        this.payRepository = payRepository;
    }

    @Override
    public List<Pay> getAllPay() {
        return payRepository.findAll();
    }

    @Override
    public Pay getPayById(Long id) {
        return payRepository.findById(id).orElse(null);
    }

    @Override
    public Pay addpay(Pay product) {
        return null;
    }

    @Override
    public Pay addPay(Pay pay) {
        return payRepository.save(pay);
    }

    @Override
    public Pay updatePay(Long id, Pay pay) {
        return payRepository.save(pay);
    }

    @Override
    public void deletePay(Long id) {
        payRepository.deleteById(id);
    }



}
