package io.reginaldlaw.myapp.restclient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import io.reginaldlaw.myapp.model.Manager;
import io.reginaldlaw.myapp.model.ManagerComparator;

public class ManagerRestClient {
    
    RestTemplate restTemplate;
    
    public ManagerRestClient() {
        
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        
        restTemplate = restTemplateBuilder.build();
        
    }
    
    public List<Manager> getManagers(String url) throws Exception {
        List<Manager> managerList = null;
        // Manager managers = restTemplate.getForObject(url, Manager.class);
        try {
            ResponseEntity<Manager[]> response = restTemplate.getForEntity(url, Manager[].class);
        Manager[] managers = response.getBody();
        managerList = Arrays.asList(managers);
        Collections.sort(managerList, new ManagerComparator());
        } catch (Exception ex)
        {
            throw ex;
        }
       return managerList;    
    }

}
