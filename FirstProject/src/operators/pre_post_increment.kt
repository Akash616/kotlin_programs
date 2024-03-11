package operators

/* i++, ++i, i--, --i*/
fun main(){
    var i = 10
    var j = 10
    //i++ //post increment
    //++i //pre increment
    println(i++) //10
    println(i) //11
    println(++j) //11
    println(j) //11

    var t = 10
    println(t++ + ++t) //10 + 12 = 22
    //first t=10 then in memeory=11 in case of post inc/dec.

}