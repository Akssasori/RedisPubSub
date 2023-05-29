package com.broker.redis.publisher;

import com.broker.redis.dto.ProductDTO;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
@Log4j2
public class ProductController {


    @PostMapping
    public ResponseEntity<String> register(@Valid @RequestBody ProductDTO productDTO) {
       log.info("received {}", productDTO);
        return ResponseEntity.ok().body("Success");
    }
}
