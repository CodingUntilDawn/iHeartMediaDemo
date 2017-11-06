package iHeartMediaDemo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StationMapper{

    @Select("SELECT * FROM STATIONS")
    List<StationModel> getAllStations();

    @Select("SELECT * FROM STATIONS where stationId = (#{stationId})")
    StationModel getById(int stationId);

    @Select("SELECT * FROM STATIONS where name = (#{stationName})")
    StationModel getByName(String stationName);

    @Insert("Insert into Stations Value(#{stationModel.stationId}, #{stationModel.stationName}, #{stationModel.hdEnabled}, #{stationModel.Callsign})")
    StationModel addStation(StationModel stationModel);
    //any implementation of this will have to check if the stationId already exists

    @Update("Update Stations Set stationId = #{stationModel.stationId}, name = #{stationModel.stationName}, hdEnabled = #{stationModel.hdEnabled}, callSign = #{stationModel.callSign}")
    StationModel updateStation(StationModel stationModel);
}
