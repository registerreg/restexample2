package io.reginaldlaw.myapp.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.reginaldlaw.myapp.model.EmployeeBean;
import io.reginaldlaw.myapp.model.Manager;
import io.reginaldlaw.myapp.restclient.ManagerRestClient;

@RestController
// @RequestMapping(value = "/")
public class AppController {
    String url = "https://o3m5qixdng.execute-api.us-east-1.amazonaws.com/api/managers";
    ManagerRestClient managerRestClient;
    
    public AppController() {
        managerRestClient =  new ManagerRestClient();
    }
    
    @GetMapping(value = "/api/supervisors", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getManagers() throws Exception {
        String result = "";
             
        List<Manager> managers = managerRestClient.getManagers(url);
        for (int i = 0; i < managers.size(); i++) {
            if (StringUtils.isNumeric(managers.get(i).getJurisdiction()) == false) {
                result = result + managers.get(i).getJurisdiction() + " - " + managers.get(i).getLastName() + ", " +
                    managers.get(i).getFirstName() + "\n";
            }
        } 
        return ResponseEntity.status(201).body(result);    
    }
    
    @PostMapping(value = "/app/submit")
    public ResponseEntity<String> handlePostSupervisor(
            @RequestBody EmployeeBean employeeBean) {
        
     // Check if the required parameters are present
        String missingParams = getMissingParams(employeeBean);
        if (!missingParams.isEmpty()) {
            String errorMessage = "Required parameters are missing: " + missingParams;
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(errorMessage);
        }

        // Check if the required parameters are present
        if (employeeBean.getFirstName() == null ||
            employeeBean.getLastName() == null ||
            employeeBean.getSupervisor() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Required parameters are missing");
        }
        
        System.out.println("FirstName : " + employeeBean.getFirstName());
        System.out.println("LastName : " +  employeeBean.getLastName());
        System.out.println("email : " + employeeBean.getEmail());
        System.out.println("phone number : " + employeeBean.getPhoneNumber());
        System.out.println("supervisor : " + employeeBean.getSupervisor());

        return ResponseEntity.ok("Request processed successfully");
    }
    
    private String getMissingParams(EmployeeBean employeeBean) {
        StringBuilder missingParams = new StringBuilder();
        if (employeeBean.getFirstName() == null) {
            missingParams.append("firstName, ");
        }
        if (employeeBean.getLastName() == null) {
            missingParams.append("lastName, ");
        }
        if (employeeBean.getSupervisor() == null) {
            missingParams.append("supervisor, ");
        }
        // Remove the trailing comma and space, if any
        if (missingParams.length() > 0) {
            missingParams.delete(missingParams.length() - 2, missingParams.length());
        }

        return missingParams.toString();
    }

}
