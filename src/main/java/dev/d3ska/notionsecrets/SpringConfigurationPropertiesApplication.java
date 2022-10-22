package dev.d3ska.notionsecrets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(NotionConfigProperties.class)
public class SpringConfigurationPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigurationPropertiesApplication.class, args);
    }

}
