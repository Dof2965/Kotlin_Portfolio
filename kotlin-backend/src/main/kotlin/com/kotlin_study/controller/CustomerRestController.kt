package com.kotlin_study.controller

import com.kotlin_study.application.CustomerService
import com.kotlin_study.domain.entity.CustomerEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/v1/customer")
class CustomerRestController (
        private val customerService: CustomerService
){
    @CrossOrigin
    @GetMapping
    fun findAll(): MutableList<CustomerEntity> {
        return customerService.findAll()
    }
    @CrossOrigin
    @PostMapping("")
    fun create(@RequestBody customer: CustomerEntity): CustomerEntity {
        customerService.save(customer)
        return customer
    }
    @CrossOrigin
    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): Optional<CustomerEntity> {
        return customerService.findById(id)
    }
    @CrossOrigin
    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody customer: CustomerEntity): CustomerEntity {
        customerService.save(customer.copy(id = id))
        return customer.copy(id = id)
    }
    @CrossOrigin
    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long): String {
        customerService.delete(id)
        return "Delete Complete"
    }
}