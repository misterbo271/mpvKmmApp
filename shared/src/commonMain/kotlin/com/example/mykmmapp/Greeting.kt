package com.example.mykmmapp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hi, I'm MienPV!"
    }
}