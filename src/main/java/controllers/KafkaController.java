package controllers;

import Services.KafkaProducerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private KafkaProducerService producerService;
}
