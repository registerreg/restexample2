package io.reginaldlaw.myapp.model;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class ManagerComparator implements Comparator<Manager> {

    @Override
    public int compare(Manager o1, Manager o2) {
        return new CompareToBuilder()
            .append(o1.getJurisdiction(),o2.getJurisdiction())
            .append(o1.getLastName(), o2.getLastName())
            .append(o1.getFirstName(), o2.getFirstName())
            .build();
    }
    
    

}
