package com.pichincha.base;

import com.pichincha.model.Response;
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
    public Response checkAvailability(@PathVariable String id) throws UnknownHostException {
        Response response = new Response();
        response.setMessage("Hello " + id + " from " + InetAddress.getLocalHost().getHostName());
        return response;
    }

}
