package com.example.api.controller


import com.example.api.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.

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

    @PostMapping()
    Category save(@RequestBody Category category) {
        categoryService.save(category)
    }

    @PutMapping("{id}")
    Category update(@RequestBody Category category, @PathVariable("id") int id) {
        categoryService.update(category, id)
    }

    @DeleteMapping('{id}')
    Category delete(@PathVariable('id') int id) {
    categoryService.delete(id)
    }
}
