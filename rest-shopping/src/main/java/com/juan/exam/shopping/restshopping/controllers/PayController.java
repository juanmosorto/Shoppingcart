package com.juan.exam.shopping.restshopping.controllers;


import com.juan.exam.shopping.restshopping.models.entities.Pay;
import com.juan.exam.shopping.restshopping.services.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PayController {

    private final PayService payService;

    @Autowired
    public PayController(PayService payService) {
        this.payService = payService;
    }

    @GetMapping
    public List<Pay> getAllPay() {
        return payService.getAllPay();
    }

    @GetMapping("/{id}")
    public Pay getPayById(@PathVariable Long id) {
        return payService.getPayById(id);
    }

    @PostMapping
    public Pay addPay(@RequestBody Pay pay) {
        return payService.addpay(pay);
    }

    @PutMapping("/{id}")
    public Pay updatePay(@PathVariable Long id, @RequestBody Pay pay) {
        return payService.updatePay(id, pay);
    }

    @DeleteMapping("/{id}")
    public void deletePay(@PathVariable Long id) {
        payService.deletePay(id);
    }



}
