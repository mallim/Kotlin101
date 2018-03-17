package Objects.ObjectClass

fun main(args: Array<String>) {

    val espana = Matador( "Emilio" )

    Matador.show( espana )
}

class Matador( name: String ){
    private val name : String = name

    private fun myPrivateShow(){
        println( "This is ${name} private show")
    }

    companion object {
        fun show( mt: Matador ){
            // function inside a class object can access private properties and function of the class
            println( "Expose the private secret of ${mt.name}")
            mt.myPrivateShow()
        }
    }
}