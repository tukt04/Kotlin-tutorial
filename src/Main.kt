
fun main(){
    // practice1()
    // practice2()
    practice3()
}

// Complete the code to make the program print "Mary is 20 years old" to standard output
fun practice1(){
    val name = "Mary"
    val age = 20
    print("$name is $age years old")
}

fun practice2(){
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}

fun practice3(){
    // Exercise1
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    val totalCount: Int = greenNumbers.count() + redNumbers.count()
    println(totalCount)

    // Exercise2
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")

    // Exercise3
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}