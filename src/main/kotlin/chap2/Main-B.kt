package chap2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {
    val task = launch {
        doSomething()
    }
    task.join()
    println("Task is completed")
}



private fun doSomething() {
    throw RuntimeException("Something went wrong")
}