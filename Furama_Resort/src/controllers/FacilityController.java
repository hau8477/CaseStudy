package controllers;

import models.facilitys.Facility;
import services.IFacilityService;
import services.impl.FacilityService;

import java.io.IOException;
import java.util.Map;

public class FacilityController {
    private static final IFacilityService facilityService = new FacilityService();

    public Map<Facility,Integer> getListFacility(){
        try {
            return facilityService.getListFacility();
        } catch (IOException e) {
            System.err.println("Error");
            return null;
        }
    }

    public void addNewFacility(Facility object,int countOfUses){
        try {
            facilityService.addNewFacility(object,countOfUses);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    public Map<Facility, Integer> getListFacilityMaintenance() {
        return facilityService.getListFacilityMaintenance();
    }
}
