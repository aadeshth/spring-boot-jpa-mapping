package com.rest.rest_example.utility;

import com.rest.rest_example.entity.DeliveryAddress;
import com.rest.rest_example.entity.Product;
import com.rest.rest_example.model.DeliveryAddressDto;
import com.rest.rest_example.model.ProductDto;

import java.util.ArrayList;
import java.util.List;

public class Conversion {

    public static Product productDtoToEntity(ProductDto productDto){
        return Product.builder().name(productDto.getName()).price(productDto.getPrice()).deliveryAddressList(productAddressDtoToEntity(productDto.getAddress())).build();
    }

    private static List<DeliveryAddress> productAddressDtoToEntity(List<DeliveryAddressDto> addressDto) {
        List<DeliveryAddress> deliveryAddresses = new ArrayList<>();
        for(DeliveryAddressDto dto :addressDto)
            deliveryAddresses.add(DeliveryAddress.builder().city(dto.getCity()).country(dto.getCountry()).zipCode(dto.getZipCode()).phoneNumber(dto.getPhoneNumber()).build());
        return deliveryAddresses;
    }

    public static ProductDto productToProductDto(Product product){
        return ProductDto.builder().id(product.getId()).name(product.getName()).price(product.getPrice()).address(productAddressEntityToDto(product.getDeliveryAddressList())).build();
    }


    private static List<DeliveryAddressDto> productAddressEntityToDto(List<DeliveryAddress> address) {
        List<DeliveryAddressDto> deliveryAddresses = new ArrayList<>();
        for(DeliveryAddress deliveryAddress :address)
            deliveryAddresses.add(DeliveryAddressDto.builder().id(deliveryAddress.getId()).city(deliveryAddress.getCity()).country(deliveryAddress.getCountry()).zipCode(deliveryAddress.getZipCode()).phoneNumber(deliveryAddress.getPhoneNumber()).build());

        return deliveryAddresses;
    }

}
