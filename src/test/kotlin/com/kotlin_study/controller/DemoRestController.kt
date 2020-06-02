package com.kotlin_study.controller

import com.kotlin_study.domain.entity.DemoEntity
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.jdbc.Sql

@SpringBootTest
@Sql("classpath:setup.sql")
class DemoControllerTest {
    @Autowired
    private lateinit var demoController: DemoRestController

    @Test
    fun noDataTest() {
        val demos = demoController.findAll()
        Assertions.assertThat(demos).isEmpty()
    }

    @Test
    fun createTest() {
        val createDemo = demoController.create(DemoEntity(name = "Kazuma"))
        Assertions.assertThat(createDemo.name).isEqualTo("Kazuma")
        Assertions.assertThat(createDemo.id).isEqualTo(createDemo.id)
    }

    @Test
    fun findByIdTest() {
        val createDemo = demoController.create(DemoEntity(name = "Kazuma"))
        val findDemo = demoController.findById(createDemo.id ?: 0)
        Assertions.assertThat(findDemo.orElse(null).name).isEqualTo("Kazuma")
    }

    @Test
    fun findAllTest() {
        val createDemo1 = demoController.create(DemoEntity(name = "Kazuma"))
        val createDemo2 = demoController.create(DemoEntity(name = "Megumin"))
        val findDemos = demoController.findAll()
        Assertions.assertThat(findDemos[0].id).isEqualTo(createDemo1.id)
        Assertions.assertThat(findDemos[0].name).isEqualTo("Kazuma")
        Assertions.assertThat(findDemos[1].id).isEqualTo(createDemo2.id)
        Assertions.assertThat(findDemos[1].name).isEqualTo("Megumin")
    }

    @Test
    fun updateTest() {
        val createDemo = demoController.create(DemoEntity(name = "Kazuma"))
        val findDemo = demoController.findById(createDemo.id ?: 0)
        Assertions.assertThat(findDemo.orElse(null).name).isEqualTo("Kazuma")

        demoController.update(createDemo.id ?: 0, DemoEntity(name = "Aqua"))
        val updateDemo = demoController.findById(createDemo.id ?: 0)
        Assertions.assertThat(updateDemo.orElse(null).name).isEqualTo("Aqua")
    }

    @Test
    fun deleteTest() {
        val createDemo = demoController.create(DemoEntity(name = "Kazuma"))
        val findDemo = demoController.findById(createDemo.id ?: 0)
        Assertions.assertThat(findDemo.orElse(null).name).isEqualTo("Kazuma")
        demoController.delete(createDemo.id ?: 0)
        val deleteDemo = demoController.findById(createDemo.id ?: 0)
        Assertions.assertThat(deleteDemo).isEmpty
    }
}