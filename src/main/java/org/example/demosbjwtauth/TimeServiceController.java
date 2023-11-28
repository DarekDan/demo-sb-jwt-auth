package org.example.demosbjwtauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/time")
public class TimeServiceController {

    @GetMapping
    public Mono<String> getCurrentTime() {
        return Mono.just(LocalDateTime.now().toString());
    }
}

