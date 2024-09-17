package com.juan.exam.shopping.restshopping.services;
import com.juan.exam.shopping.restshopping.models.entities.Pay;

import java.util.List;

public interface PayService {

    List<Pay> getAllPay();

    Pay getPayById(Long id);

    Pay addpay(Pay product);

    Pay addPay(Pay pay);

    Pay updatePay(Long id, Pay product);

    void deletePay(Long id);
}
