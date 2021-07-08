package tap.tracing.applicationa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppController {
    @Autowired
    private RestTemplate restTemplate;

    private final String applicationAUrl = "http://localhost:8081";
    private final String applicationBUrl = "http://localhost:8082";
    private final String applicationCUrl = "http://localhost:8083";

    @GetMapping(value = "/get/{id}")
    public App getAppFromApplicationB(@PathVariable String id){
        final String uri = applicationBUrl + "/get/" + id;

        App response = restTemplate.getForObject(uri, App.class);
        return response;
    }

}
