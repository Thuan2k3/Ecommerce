package com.thuandev.Thuan.Ecommerce.service.interf;

import com.thuandev.Thuan.Ecommerce.dto.AddressDto;
import com.thuandev.Thuan.Ecommerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
