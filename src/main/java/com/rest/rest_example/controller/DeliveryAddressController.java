package com.rest.rest_example.controller;

import com.rest.rest_example.model.DeliveryAddressDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product/delivery")
public class DeliveryAddressController {



    // Validate Request
    @PostMapping
    public ResponseEntity<Object> addProduct(@RequestBody @Valid DeliveryAddressDto deliveryAddressDto) {

        return new ResponseEntity<>(deliveryAddressDto,HttpStatus.OK);
    }
}
