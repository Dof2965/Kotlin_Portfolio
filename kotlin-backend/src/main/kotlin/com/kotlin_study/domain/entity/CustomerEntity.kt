package com.kotlin_study.domain.entity

import javax.persistence.*

@Entity
@Table(name = "customer")
data class CustomerEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Long? = null,

        @Column(name = "name", length = 100, nullable = false)
        val name: String,

        @Column(name = "password", length = 100, nullable = false)
        val password: String,

        @Column(name = "mail", length = 256)
        val mail: String? = null
)