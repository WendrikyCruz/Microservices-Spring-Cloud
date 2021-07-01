package com.wendriky.hrpayroll.services;

import com.wendriky.hrpayroll.entities.Payment;
import com.wendriky.hrpayroll.entities.Worker;
import com.wendriky.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    /*
    @Autowired
    private RestTemplate restTemplate;


    @Value("${hr-worker.host}")
    private String workerHost;
     */

    @Autowired
    private WorkerFeignClient workerfeignClient;

    public Payment getPayment(long workerid, int days) {
        // Map<String, String> uriVariables = new HashMap<>();
        //uriVariables.put("id",Long.toString(workerid));

        //Worker worker = this.restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
        Worker worker = this.workerfeignClient.findById(workerid).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }


}
