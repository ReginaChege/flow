fun main(){
    oddArray()
    robotdrink(5)
    robotdrink(14)
    robotdrink(20)
    var m = arrayName(arrayOf("Regina","Esther","Esmeralda","Joannah"))
    println(m)
    mutiples()


}
//Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun oddArray(){
    for (num in 0..100){
        if (num % 2 !=0) {
            println(num)
        }
    }
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun robotdrink(ages:Int){
    when (ages){
        in  1..5-> println("Serve a glass of milk")
        in 6..14-> println("Serve bottle of water")
        else -> println("bottle of coca cola")
    }


}
//Write a function that prints each number from 1 to 100 on a new line. For each
////multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun mutiples() {
    for (multiples in 0..100) {
        if (multiples % 3 == 0) {
            println("Fizz")
        }
        if (multiples % 5 == 0) {
            println("Buzz")
        } else {
            (multiples %3 == 0 && multiples % 5==0)
            println("FizzBuzz")
        }
    }

}

//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun arrayName(name: Array<String>) :Int{
    var sum =0
    for (r in name){
        if (r.length>5){
            sum++


        }
    }
    return sum
}
