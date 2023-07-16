package chap2

import kotlinx.coroutines.*

fun main() = runBlocking {
    val dispatcher = newSingleThreadContext("myThread")
    val task = GlobalScope.launch { (dispatcher) {
            doSomething()
        }
    }
    task.join()
}


private fun doSomething() {
    println("${Thread.currentThread().name} is running")
}