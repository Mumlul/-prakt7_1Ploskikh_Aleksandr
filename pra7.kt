import kotlin.math.*

fun main(){

//try{
//
//    //2
    var m: Int
    var n: Int
    var s: Double
    do{
        println("m-")
        m= readln()!!.toInt()
        println("n-")
        n= readln()!!.toInt()
    }while(m<=0||n<=m)
    println("введите значение элементов")
    var am= readln()!!.toDouble()
    var an= readln()!!.toDouble()
    s=(am+an)*(n-m+1)/2
    println("Sum=%.2f".format(s))
//
//
//}catch (e:Exception){
//    println("Некорректные данные")
//}
//    try {
//        //9
//
//        var a= readLine()!!.toDouble()
//        var b= readLine()!!.toDouble()
//        var c= readLine()!!.toDouble()
//        var p: Double
//        p=(a+b+c)/3
//        println("sr:"+p)
//    }catch (e:Exception){
//        println("Некорректные данные")
//    }
    try {
        //7.1
        var x= readLine()!!.toDouble()
        var y= readLine()!!.toDouble()
        var z= readLine()!!.toDouble()
        var a=(sqrt(abs(x-1))-sqrt(y).pow(3))/(1+x.pow(2)/2+y.pow(2)/4)
        var b=x* abs(atan(z)+  2.71828.pow(-(x+3)))
        println(a)
        println(b)
    }catch (e:Exception){
        println("Некорректные данные")
    }
}
