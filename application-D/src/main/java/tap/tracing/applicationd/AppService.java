package tap.tracing.applicationd;

import org.springframework.stereotype.Service;

@Service
public class AppService {
    public App GenerateNewApp(String id){
        App app = new App(id);
        app.setUp(false);
        app.setAge(10);
        return app;
    }
}