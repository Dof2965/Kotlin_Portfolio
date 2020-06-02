package com.kotlin_study.domain.entity

import javax.persistence.*

@Entity
@Table(name = "demo")
data class DemoEntity (
    @Id
    @GeneratedValue
    val id: Long? = null,

    @Column(name = "name", length = 100, nullable = false)
    val name: String
)