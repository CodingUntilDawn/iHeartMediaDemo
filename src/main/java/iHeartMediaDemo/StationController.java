package iHeartMediaDemo;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StationController {

    @Autowired
    private StationService stationService;
    
    @PutMapping("/stations/addStation")
    public StationModel addStation(@RequestBody StationModel stationModel){
        //just a test for now
        return stationModel;
    }

    @PutMapping("/stations/updateStation")
    public StationModel updateStation(@RequestBody StationModel stationModel){
        //just a test for now
        return stationModel;
    }

    @GetMapping("/stations")
    public List<StationModel>GetAllStations(){
        return null;
    }

    @GetMapping("/stations/{stationId}")
    public StationModel GetStationById(){
        return null;
    }

    @GetMapping("/stations/{stationName}")
    public StationModel GetStationByName(){
        return null;
    }

    @PostMapping("stations/removeStation")
    public int removeStation(@RequestBody int stationId){
        return Response.SC_OK;
    }
}
