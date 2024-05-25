package `cap-two`
import `cap-two`.createRandomRectangle

fun main(args: Array<String>){
    println("Hello, world!")
    //Import de funcao
    println(createRandomRectangle().isSquare)

    println(max(1,2))
}

fun max(a: Int, b: Int): Int{
    return if(a > b) a else b
}
