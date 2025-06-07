package com.thuandev.Thuan.Ecommerce.service.interf;

import com.thuandev.Thuan.Ecommerce.dto.CategoryDto;
import com.thuandev.Thuan.Ecommerce.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
