package dev.d3ska.notionsecrets.api;

import java.util.Map;

import dev.d3ska.notionsecrets.ConfigProperties;
import dev.d3ska.notionsecrets.NotionConfigProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notion")
public class NotionController {

    private final NotionConfigProperties notionConfigProperties;

    @GetMapping
    public ConfigProperties getConfigs(){
        return notionConfigProperties;
    }
}
