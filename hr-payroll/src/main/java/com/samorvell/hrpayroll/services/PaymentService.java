package com.samorvell.hrpayroll.services;

import com.samorvell.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workrId, int days){
        return new Payment("Bob", 200.00, days);
    }

}
