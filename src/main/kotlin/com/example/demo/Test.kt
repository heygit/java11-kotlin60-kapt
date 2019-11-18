package com.example.demo

enum class Test {

    FIRST {
        override fun raz(): Int {
            println("1")

            return 7
        }
    },
    SECOND {
        override fun raz(): Int {
            println("3")

            return 8
        }
    };

    open fun raz(): Int {
        println("1")

        return 5
    }
}