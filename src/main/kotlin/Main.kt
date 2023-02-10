fun main (args: Array<String>){
    greetPerson("Idaya")
    remainder(num1=82, num2=4)
    addition(num1=6, num2=8, num3=5, num4=4)
    statement("I love reading")


}

fun greetPerson(name: String){
    println("Hello $name" )
}

fun remainder(num1:Int, num2:Int):Int{
    var remainder=num1%num2
    println(remainder)
    return(remainder)
}

fun addition(num1:Int, num2:Int, num3:Int, num4:Int) {
    var addition=num1+num2+num3+num4
    println(addition)

}

fun statement(Idaya:String) {
    println("I love reading")
}
