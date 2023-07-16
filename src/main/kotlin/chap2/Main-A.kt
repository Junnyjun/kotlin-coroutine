package chap2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {
    val task = GlobalScope.async {
        doSomething()
    }
    task.join()
    if (task.isCancelled) {
        println("Task is cancelled")
    } else {
        println("Task is completed")
    }
}



private fun doSomething() {
    throw RuntimeException("Something went wrong")
}