package com.kotlin_study.domain.repository

import com.kotlin_study.domain.entity.DemoEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DemoRepository : JpaRepository<DemoEntity, Long> {
    fun findById(id: Int): DemoEntity?
    fun save(demo: DemoEntity): DemoEntity?
}