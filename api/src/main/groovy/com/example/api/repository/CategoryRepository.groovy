package com.exa.api.repository


interface CategoryRepository {
    List<Category> findAll()
    Category findById(Integer id)
}
