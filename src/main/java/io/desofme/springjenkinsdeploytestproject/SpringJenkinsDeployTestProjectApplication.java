package io.desofme.springjenkinsdeploytestproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication
public class SpringJenkinsDeployTestProjectApplication {

    public static void main(String[] args) {
        var app = new SpringApplication(SpringJenkinsDeployTestProjectApplication.class);
        Environment environment = app.run(args).getEnvironment();
        log.info("Application running in following profiles: {}", environment.getActiveProfiles());
    }

}