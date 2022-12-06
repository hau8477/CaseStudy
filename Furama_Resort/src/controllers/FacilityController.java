package controllers;

import models.facilitys.Facility;
import services.IFacilityService;
import services.impl.FacilityService;

import java.util.Map;

public class FacilityController {
    private static final IFacilityService facilityService = new FacilityService();

    public Map<Facility,Integer> getListFacility(){
        return facilityService.getListFacility();
    }

    public void addNewFacility(Facility object,int countOfUses){
        facilityService.addNewFacility(object,countOfUses);
    }

    public Map<Facility, Integer> getListFacilityMaintenance() {
        return facilityService.getListFacilityMaintenance();
    }
}
