package controllers;

import Services.KafkaProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService)
    {
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message)
    {
        producerService.sendMessage(message);
        return "Message Sent Successfully";
    }
}
