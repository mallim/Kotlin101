package Collections.ArrayList

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    val list = arrayListOf( 1, 2, 3 )
    list.forEach{ println( it )}

    val list2 = arrayListOf( Pair( "Bill", "Clinton" ), Pair( "George W.", "Bush" ), Pair( "Barack", "Obama" ) )

    list2.add( Pair( "Hillary", "Clinton" ) )

    list2.forEach{ println( "${it.first} - ${it.second} " ) }

    //
    // Got this from https://github.com/steelkiwi/collection_in_kotlin
    //
    // note that filter and dropWhile return a new instance like many other operators.
    // That means originalList remains unchanged.
    //
    val originalList = listOf(1, 2, 3, 4, 5, 6)
    assertEquals(listOf(2, 4, 6), originalList.filter { it % 2 == 0 })

    val originalList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = originalList2.firstOrNull { it > 4 }
    assertEquals(result, 5)

    val originalList3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result2 = originalList3.getOrElse(12) { 12 }
    assertEquals(result2, 12)

    val originalList4 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result3 = originalList4.dropWhile { it < 5 }
    assertEquals(result3, listOf(5, 6, 7, 8, 9, 10))

    val originalList5 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result4 = originalList5
            .dropWhile { it < 5 }
            .find { it < 7 }
    assertEquals(result4, 5)

}