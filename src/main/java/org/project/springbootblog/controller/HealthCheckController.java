package org.project.springbootblog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/healthcheck")
public class HealthCheckController {

    @RequestMapping("")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("OK");
    }
}
