package com.application

import javafx.application.Application
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class DashboardApplication {
    companion object{
        @JvmStatic
        fun main (args: Array<String>){
            Application.launch(DashBoardFXStart::class.java, *args)
//            SpringApplication.run(DashboardApplication::class.java, *args)
            println("Application has Started!")
        }
    }
}