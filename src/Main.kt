
fun main(){
    // practice1()
    // practice2()
    // practice3()
    practice4()
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

fun practice4(){
    // Exercise1
    val button = "A"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )

    // Exercise2
    var pizzaSlices = 0
    while ( pizzaSlices < 7 ) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")


    pizzaSlices = 0
    pizzaSlices++
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while ( pizzaSlices < 8 )
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    // Exercise3
    for(i in 1..100){
        if(i%15==0)print("fizzbuzz")
        else if(i%3==0)print("fizz")
        else if(i%5==0)print("buzz")
        else print(i)
        println()
    }

    // Exercise4
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for(word in words){
        if(word.startsWith('l')) println(word)
    }
}