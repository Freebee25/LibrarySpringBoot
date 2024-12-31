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

    @Override
    Category save(Category category) {
        categoryRepository.save(category)
    }

    @Override
    Category update(Category category, int id) {
        def record = CategoryRepository.findById(id)
        record.with {
        name = category.name
        }
        CategoryRepository.save(record)
        record
    }

    @Override
    Category delete(int id) {
        def record = CategoryRepository.findById(id)
        CategoryRepository.delete(record)
        record
    }
}
