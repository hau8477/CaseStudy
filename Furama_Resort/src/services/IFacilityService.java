package services;

import models.facilitys.Facility;

import java.util.List;

public interface IFacilityService extends IService<Facility>{
    List<Facility> displayFacilityMaintenance();
}
