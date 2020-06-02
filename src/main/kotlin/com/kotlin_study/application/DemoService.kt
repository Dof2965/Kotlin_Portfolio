package com.kotlin_study.application

import com.kotlin_study.domain.entity.DemoEntity
import com.kotlin_study.domain.repository.DemoRepository
import org.springframework.stereotype.Service

@Service
class DemoService(private val demoRepository: DemoRepository) {

    fun findAll(): MutableList<DemoEntity> = demoRepository.findAll()

    fun findById(id: Long) = demoRepository.findById(id)

    fun save(demo: DemoEntity) = demoRepository.save(demo)

    fun delete(id: Long) = demoRepository.deleteById(id)
}