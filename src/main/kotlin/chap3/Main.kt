package chap3

import kotlinx.coroutines.*

fun main(args: Array<String>) {
    runBlocking {
        GlobalScope.launch(start = CoroutineStart.LAZY) {

        }
        delay(500)
    }

}