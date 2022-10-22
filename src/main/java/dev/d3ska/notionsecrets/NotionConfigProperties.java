package dev.d3ska.notionsecrets;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("notion")
public record NotionConfigProperties(String apiUrl, String apiVersion,
                                     String authToken, String databaseId) implements ConfigProperties {

    @Override
    public Map<String, String> properties() {
        return Map.of(
                "apiUrl", apiUrl,
                "apiVersion", apiVersion,
                "authToken", authToken,
                "databaseId", databaseId
        );
    }
}
