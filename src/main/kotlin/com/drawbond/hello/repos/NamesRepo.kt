package com.drawbond.hello.repos

import com.drawbond.hello.domain.Name
import org.springframework.data.repository.CrudRepository

interface NamesRepo : CrudRepository<Name, String>