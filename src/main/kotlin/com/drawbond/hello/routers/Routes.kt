package com.drawbond.hello.routers

import com.drawbond.hello.handlers.NameHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class Routes(private val nameHandler: NameHandler) {
    @Bean
    fun router() = router {
        "/hello".nest {
            GET("/{nameId}", nameHandler::getName)
            POST("", nameHandler::postName)
        }
    }
}