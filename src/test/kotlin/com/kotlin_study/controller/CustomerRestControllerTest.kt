package com.kotlin_study.controller

import com.kotlin_study.domain.entity.CustomerEntity
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.jdbc.Sql

@SpringBootTest
@Sql("classpath:setup.sql")
class CustomerRestControllerTest {
    @Autowired
    private lateinit var customerController: CustomerRestController

    @Test
    fun noDataTest() {
        val customers = customerController.findAll()
        Assertions.assertThat(customers).isEmpty()
    }

    @Test
    fun createTest() {
        val createCustomer = customerController.create(CustomerEntity(name = "Kazuma", mail = "hoge@huga.com"))
        Assertions.assertThat(createCustomer.name).isEqualTo("Kazuma")
        Assertions.assertThat(createCustomer.id).isEqualTo(createCustomer.id)
        Assertions.assertThat(createCustomer.mail).isEqualTo(createCustomer.mail)
    }

    @Test
    fun findByIdTest() {
        val createCustomer = customerController.create(CustomerEntity(name = "Kazuma", mail = "hoge@huga.com"))
        val findCustomer = customerController.findById(createCustomer.id ?: 0)
        Assertions.assertThat(findCustomer.orElse(null).name).isEqualTo("Kazuma")
        Assertions.assertThat(createCustomer.mail).isEqualTo(createCustomer.mail)
    }

    @Test
    fun findAllTest() {
        val createCustomer1 = customerController.create(CustomerEntity(name = "Kazuma", mail = "hoge@huga.com"))
        val createCustomer2 = customerController.create(CustomerEntity(name = "Megumin"))
        val findCustomers = customerController.findAll()
        Assertions.assertThat(findCustomers[0].id).isEqualTo(createCustomer1.id)
        Assertions.assertThat(findCustomers[0].name).isEqualTo("Kazuma")
        Assertions.assertThat(findCustomers[0].mail).isEqualTo("hoge@huga.com")
        Assertions.assertThat(findCustomers[1].id).isEqualTo(createCustomer2.id)
        Assertions.assertThat(findCustomers[1].name).isEqualTo("Megumin")
        Assertions.assertThat(findCustomers[1].mail).isNull()
    }

    @Test
    fun updateTest() {
        val createCustomer = customerController.create(CustomerEntity(name = "Kazuma", mail = "hoge@huga.com"))
        val findCustomer = customerController.findById(createCustomer.id ?: 0)
        Assertions.assertThat(findCustomer.orElse(null).name).isEqualTo("Kazuma")

        customerController.update(createCustomer.id ?: 0, CustomerEntity(name = "Aqua", mail = "xxx@yyy.com"))
        val updateCustomer = customerController.findById(createCustomer.id ?: 0)
        Assertions.assertThat(updateCustomer.orElse(null).name).isEqualTo("Aqua")
        Assertions.assertThat(updateCustomer.orElse(null).mail).isEqualTo("xxx@yyy.com")
    }

    @Test
    fun deleteTest() {
        val createCustomer = customerController.create(CustomerEntity(name = "Kazuma", mail = "hoge@huga.com"))
        val findCustomer = customerController.findById(createCustomer.id ?: 0)
        Assertions.assertThat(findCustomer.orElse(null).name).isEqualTo("Kazuma")
        Assertions.assertThat(findCustomer.orElse(null).mail).isEqualTo("hoge@huga.com")
        customerController.delete(createCustomer.id ?: 0)
        val deleteCustomer = customerController.findById(createCustomer.id ?: 0)
        Assertions.assertThat(deleteCustomer).isEmpty
    }
}