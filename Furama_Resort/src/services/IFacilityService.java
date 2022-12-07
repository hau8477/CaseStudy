package services;

import models.facilitys.Facility;

import java.io.IOException;
import java.util.Map;

public interface IFacilityService{
    void addNewFacility(Facility object,int countOfUses) throws IOException;

    Map<Facility,Integer> getListFacilityMaintenance();

    Map<Facility,Integer> getListFacility() throws IOException;

}
