package com.exa.api.service


interface CategoryService {
    List<Category> findAll()
    Category findById(int id)
}
