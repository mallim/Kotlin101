package When

fun main(args: Array<String>) {
    var x = 101

    // this is one hell of a flexible switch statement
    when{
        x in 1..50 -> print( "In range" )
        x > 100 -> print( "Great" )
        x == 50 -> print( "Exact Match" )
        else -> print( "Outside range" )
    }
}