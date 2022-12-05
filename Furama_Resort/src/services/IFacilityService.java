package services;

import models.facilitys.Facility;

import java.util.Map;

public interface IFacilityService{
    void addNewFacility(Facility object,int countOfUses);

    Map<Facility,Integer> getListFacilityMaintenance();

    Map<Facility,Integer> getListFacility();

    void returnMainMenu();
}
