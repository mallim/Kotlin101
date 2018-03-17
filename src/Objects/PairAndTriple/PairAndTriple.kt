package Objects.PairAndTriple

// In the old days{ Kotlin, M2 }, Kotlin has tuples. They have been remvoed at M3. Now you can use instead Pair or Triple ( they are implemented as data class }

fun main(args: Array<String>) {
    var greet = Pair( "Hello", "World" )
    val( world1, world2 ) = greet

    println( "${greet.first} ${greet.second} or $world1 $world2" )

    var greet2 = Triple( "I", "am", 34 )
    val( word3, word4, number ) = greet2

    println( "${greet2.first} ${greet2.second} ${greet2.third} or $word3 $word4 $number")

    // extension function "to" create pair
    val greet3 = "Hello" to "World2"
    println( "${greet3.first} ${greet3.second}")
}