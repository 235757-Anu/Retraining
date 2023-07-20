package in.stackroute.controllers;

import in.stackroute.dto.BookDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private final RabbitTemplate rabbitTemplate;

    public BookController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value("${spring.rabbitmq.template.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.template.routing-key}")
    private String routingkey;

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody BookDto bookDto){
        rabbitTemplate.convertAndSend(exchange, routingkey, bookDto);
        return ResponseEntity.ok().body("Message send successfully");
    }

}