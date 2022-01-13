import kotlinx.coroutines.*

fun main() {
   val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
   repeat(3) {
       GlobalScope.launch {
           println("${Thread.currentThread()} has started")
           for (i in states) {
               println("${Thread.currentThread()} - $i")
               delay(5000)
           }
       }
   }
}
