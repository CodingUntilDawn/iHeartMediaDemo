package iHeartMediaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StationController {

    @Autowired
    private StationService stationService;

    @RequestMapping("/")
    public String index() {
        return "Bare Bones Route Test\n";
    }

    @GetMapping("/stations")
    public List<StationModel>GetAllStations(){
        return null;
    }

    @GetMapping("/stations/{stationId}")
    public List<StationModel>GetStationById(){
        return null;
    }

    @GetMapping("/stations/{stationName}")
    public List<StationModel>GetStationByName(){
        return null;
    }

    @PutMapping("/stations/addStation")
    public StationModel addStation(@RequestBody StationModel stationModel){
        //just a test for now
        return stationModel;
    }
}
