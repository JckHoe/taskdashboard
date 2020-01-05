package com.application

import javafx.application.Application
import javafx.stage.Stage
import org.springframework.boot.SpringApplication
import org.springframework.stereotype.Component

@Component
open class DashBoardFXStart : Application() {

    override fun init() {
        SpringApplication.run(DashboardApplication::class.java)
    }

    override fun start(p0: Stage?) {

    }
}