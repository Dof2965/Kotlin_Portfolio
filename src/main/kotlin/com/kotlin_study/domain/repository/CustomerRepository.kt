package com.kotlin_study.domain.repository

import com.kotlin_study.domain.entity.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<CustomerEntity, Long> {
    fun findById(id: Int): CustomerEntity?
    fun save(customer: CustomerEntity): CustomerEntity?
}
