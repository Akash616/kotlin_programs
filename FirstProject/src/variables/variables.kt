package variables

fun main() {

    /*var can be reassigned.
    val can't be reassigned.*/

    /*Datatype size is different - (ctrl + shift + p)
    * INTEGER (Byte, Short, Int, Long)
    * FLOATING POINT (Float, Double)
    * BOOLEAN (True, False)
    * CHARACTER (Char, String)
    */

    var score = 5
    score = 10
    //score = "ak" //type checking at compile time.

    val name = "AkashGupta"
    //name = "New" //error

    println(score)
    println(name)

    //-----Now explicitly define type of variable--------------
    var temperature: Double = 3.15
    var src: Int = 10
    var isRaining: Boolean = true
    var alpha: Char = 'A'
    var msg: String = "new message"

}
