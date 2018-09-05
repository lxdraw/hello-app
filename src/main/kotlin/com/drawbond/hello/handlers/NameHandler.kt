package com.drawbond.hello.handlers

import com.drawbond.hello.domain.Name
import com.drawbond.hello.repos.NamesRepo
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono
import java.net.URI
import java.util.*

@Component
class NameHandler(private val namesRepo: NamesRepo) {
    fun getName(request: ServerRequest): Mono<ServerResponse> =
            ServerResponse.ok().syncBody(namesRepo.findById(request.pathVariable("nameId")).get().name)


    fun postName(request: ServerRequest): Mono<ServerResponse> =
            request.bodyToMono(String::class.java).flatMap {
                val name = namesRepo.save(Name(UUID.randomUUID().toString(), it))

                ServerResponse.created(URI.create("/hello/${name.id}")).build()
            }
}