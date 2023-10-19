package com.ie.atu;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotificationController {

    @PostMapping("/received")
    public String confirmDetails(@RequestBody UserDetails userDetails){
        return String.format("Notification enabled for %s with email %s", userDetails.getName(), userDetails.getEmail());
    }

}
