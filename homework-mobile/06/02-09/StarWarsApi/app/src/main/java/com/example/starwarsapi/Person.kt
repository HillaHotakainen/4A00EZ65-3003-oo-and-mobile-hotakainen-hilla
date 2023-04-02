package com.example.starwarsapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties(ignoreUnknown = true)
data class Person(var name: String? = null, var mass: Int = 0, var height: Int = 0)