package com.example.api.controller


import com.example.api.service.CategoryService

@RestController
@RequestMapping("/categories")
class CategoryController {

    @Autowired
    private CategoryService categoryService

    @GetMapping("")
    List<Category> findAll() {
        categoryService.findAll()
    }

    @GetMapping("{id}")
    Category findById(@PathVariable("id") int id) {
        categoryService.findById(id)
    }
}
