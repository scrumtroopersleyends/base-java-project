package com.pichincha.base;

import com.pichincha.model.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/host/{id}")
    public Message home(@PathVariable String id) throws UnknownHostException {
        Message message = new Message();
        message.setMessage("Hello " + id + " from " + InetAddress.getLocalHost().getHostName());
        return message;
    }

}
