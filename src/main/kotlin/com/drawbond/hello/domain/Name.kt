package com.drawbond.hello.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "hello_names")
data class Name (@Id val id: String = "", @Column val name: String = "")