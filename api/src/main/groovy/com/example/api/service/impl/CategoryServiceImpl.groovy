package com.exa.api.service.impl


import com.exa.api.repository.CategoryRepository
import com.exa.api.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository

    @Override
    List<Category> findAll() {
        categoryRepository.findAll()
    }

    @Override
    Category findById(int id) {
        categoryRepository.findById(id)
    }
}
