package iHeartMediaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
