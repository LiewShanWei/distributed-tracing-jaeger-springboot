package tap.tracing.applicationc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    private AppService appService;

    private final String applicationAUrl = "http://localhost:8081";
    private final String applicationBUrl = "http://localhost:8082";
    private final String applicationCUrl = "http://localhost:8083";

    @GetMapping(value = "/get/{id}")
    public App getApp(@PathVariable String id){
        return appService.GenerateNewApp(id);
    }
}
