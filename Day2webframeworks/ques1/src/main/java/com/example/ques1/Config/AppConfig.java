package com.example.ques1.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class AppConfig {
    @Value("${app.Name}")
    private String appname;
    @Value("${app.Version}")
    private String appversion;
public String getAppname() {
        return appname;
    }
    public String getAppversion() {
        return appversion;
    }
}

