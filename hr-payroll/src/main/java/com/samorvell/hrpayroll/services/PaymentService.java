package com.samorvell.hrpayroll.services;

import com.samorvell.hrpayroll.entities.Payment;
import com.samorvell.hrpayroll.entities.Worker;
import com.samorvell.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workrId, int days){
        Worker worker = workerFeignClient.findById(workrId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
