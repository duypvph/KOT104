package duypvph46.fpoly.lab1_md18306

fun main(args: Array<String>) {
    vd1()
    vd2()
}

fun vd1(){
    println("Hello, World!")
}
fun vd2(){
    fun printMessage(message: String): Unit {                               // 1
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
        println("[$prefix] $message")
    }

    fun sum(x: Int, y: Int): Int {                                          // 3
        return x + y
    }

    fun multiply(x: Int, y: Int) = x * y                                    // 4

    fun main() {
        printMessage("Hello")                                               // 5
        printMessageWithPrefix("Hello", "Log")                              // 6
        printMessageWithPrefix("Hello")                                     // 7
        printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
        println(sum(1, 2))                                                  // 9
        println(multiply(2, 4))                                             // 10
    }
}
fun vd3(){
    
}
fun vd4(){
}
fun vd5(){
}
fun vd6(){
}
fun vd7(){
}
fun vd8(){
}
fun vd9(){
}
fun vd10(){
}
