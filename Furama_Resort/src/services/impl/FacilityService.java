package services.impl;

import models.facilitys.Facility;
import services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService {
    private static final Map<Facility,Integer> listFacility = new LinkedHashMap<>();


    @Override
    public void addNewFacility(Facility object,int countOfUses) {
        listFacility.put(object,countOfUses);
    }

    @Override
    public Map<Facility, Integer> getListFacilityMaintenance() {
        return null;
    }

    @Override
    public Map<Facility, Integer> getListFacility() {
        return listFacility;
    }

}
