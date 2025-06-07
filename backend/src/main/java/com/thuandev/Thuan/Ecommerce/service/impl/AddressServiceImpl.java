package com.thuandev.Thuan.Ecommerce.service.impl;

import com.thuandev.Thuan.Ecommerce.dto.AddressDto;
import com.thuandev.Thuan.Ecommerce.dto.Response;
import com.thuandev.Thuan.Ecommerce.entity.Address;
import com.thuandev.Thuan.Ecommerce.entity.User;
import com.thuandev.Thuan.Ecommerce.repository.AddressRepo;
import com.thuandev.Thuan.Ecommerce.service.interf.AddressService;
import com.thuandev.Thuan.Ecommerce.service.interf.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final UserService userService;

    @Override
    public Response saveAndUpdateAddress(AddressDto addressDto) {
        User user = userService.getLoginUser();
        Address address = user.getAddress();

        if(address == null){
            address = new Address();
            address.setUser(user);
        }
        if(addressDto.getStreet() != null) address.setStreet(addressDto.getStreet());
        if(addressDto.getCity() != null) address.setCity(addressDto.getCity());
        if(addressDto.getState() != null) address.setState(addressDto.getState());
        if(addressDto.getZipCode() != null) address.setZipCode(addressDto.getZipCode());
        if(addressDto.getCountry() != null) address.setCountry(addressDto.getCountry());

        addressRepo.save(address);

        String message = (user.getAddress() == null) ? "Address successfully created" : "Address successfully updated";
        return Response.builder()
                .status(200)
                .message(message)
                .build();

    }
}
