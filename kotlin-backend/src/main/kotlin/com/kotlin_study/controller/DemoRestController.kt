package com.kotlin_study.controller

import com.kotlin_study.application.DemoService
import com.kotlin_study.domain.entity.DemoEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/v1/demo")
class DemoRestController (
        private val demoService: DemoService
){
    @GetMapping
    fun findAll(): MutableList<DemoEntity> {
        return demoService.findAll()
    }
    @PostMapping("")
    fun create(@RequestBody demo: DemoEntity): DemoEntity {
        demoService.save(demo)
        return demo
    }

    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): Optional<DemoEntity> {
        return demoService.findById(id)
    }

    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody demo: DemoEntity): DemoEntity {
        demoService.save(demo.copy(id = id))
        return demo.copy(id = id)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long): String {
        demoService.delete(id)
        return "Delete Complete"
    }
}