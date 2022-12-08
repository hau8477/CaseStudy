package services.impl;

import models.facilitys.Facility;
import models.facilitys.inheritance.Room;
import models.facilitys.inheritance.Villa;
import services.IFacilityService;
import services.io_text_file.read_file.ReadFileRoom;
import services.io_text_file.read_file.ReadFileVilla;
import services.io_text_file.write_file.WriteFileRoom;
import services.io_text_file.write_file.WriteFileVilla;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService {
    private static final String FILE_ROOM = "src/data/facility/room.csv";
    private static final String FILE_VILLA = "src/data/facility/villa.csv";

    @Override
    public void addNewFacility(Facility object, int countOfUses) throws IOException {
        if (object instanceof Room) {
            Map<Room, Integer> map = ReadFileRoom.readFile(FILE_ROOM);
            map.put((Room) object, countOfUses);
            WriteFileRoom.writeFile(FILE_ROOM, map);
        } else if (object instanceof Villa) {
            Map<Villa, Integer> map = ReadFileVilla.readFile(FILE_VILLA);
            map.put((Villa) object, countOfUses);
            WriteFileVilla.writeFile(FILE_VILLA, map);
        }
    }

    @Override
    public Map<Facility, Integer> getListFacilityMaintenance() {
        return null;
    }

    @Override
    public Map<Facility, Integer> getListFacility() throws IOException {

        Map<Villa, Integer> villa = ReadFileVilla.readFile(FILE_VILLA);
        Map<Room, Integer> room = ReadFileRoom.readFile(FILE_ROOM);

        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        facilityIntegerMap.putAll(villa);
        facilityIntegerMap.putAll(room);

        return facilityIntegerMap;
    }

}
