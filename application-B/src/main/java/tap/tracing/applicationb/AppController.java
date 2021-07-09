package tap.tracing.applicationb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppService appService;

    private final String applicationAUrl = "http://localhost:8081";
    private final String applicationBUrl = "http://localhost:8082";
    private final String applicationCUrl = "http://localhost:8083";
    private final String applicationDUrl = "http://localhost:8084";

    @GetMapping(value = "/get/{id}")
    public App getAppFromApplicationC(@RequestHeader MultiValueMap<String, String> headers, @PathVariable String id){
        headers.forEach((key, value) -> System.out.printf("Header '%s' = %s%n", key, String.join("|", value)));

        return appService.GenerateNewApp(id);
    }
}
