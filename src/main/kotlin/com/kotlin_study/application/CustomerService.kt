package com.kotlin_study.application

import com.kotlin_study.domain.entity.CustomerEntity
import com.kotlin_study.domain.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(private val customerRepository: CustomerRepository) {

    fun findAll(): MutableList<CustomerEntity> = customerRepository.findAll()

    fun findById(id: Long) = customerRepository.findById(id)

    fun save(customer: CustomerEntity) = customerRepository.save(customer)

    fun delete(id: Long) = customerRepository.deleteById(id)
}