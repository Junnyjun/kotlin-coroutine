package chap1

import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(): Unit = runBlocking {
    repeat(100_000) {
        createCoroutine()
    }
}

suspend fun createCoroutine() {
  println("createCoroutine ${Thread.currentThread().name}" )
}