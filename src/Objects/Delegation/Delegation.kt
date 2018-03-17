package Objects.Delegation

// This is neat little feature being able to automatically assign an object to handle any interface

fun main(args: Array<String>) {
    var me = BruceWayne( Batman(), RichlyRich() )
    me.inWater()
    print( "Is awesomely rich? " + me.isAwesomelyRich() )
}

interface Superpower{
    fun inWater()
    fun onAir()
    fun onSoil()
}

interface Wealth{
    fun isAwesomelyRich() : Boolean
}

public class Batman() :Superpower{

    companion object {
        fun create() = Batman()
    }

    override fun inWater() {
        println( "Ack. cannot swim" )
    }

    override fun onAir() {
        println( "Requires vehicle" )
    }

    override fun onSoil() {
        println( "Awesome" )
    }

    fun isFun() : Boolean{
        return false
    }
}

public class RichlyRich : Wealth{
    override fun isAwesomelyRich(): Boolean {
        return true
    }
}

public class BruceWayne( a: Batman, b: RichlyRich ) : Superpower by a, Wealth by b