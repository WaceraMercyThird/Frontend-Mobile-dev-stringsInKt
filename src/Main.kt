fun main(){
 myString()

    var detail = myData("John Doe", 45)
    println(detail)

    leng()
    name()


}


//String “akirachix”. a function that prints out a string composed of
//the first, third and fourth characters of the string



fun myString(){
    var inst = "AkiraChix"
    println(inst[0].toString()+inst[2]+inst[3])
}



// A function that takes in 2 parameters, name and age and returns a String
fun myData(x:String, y:Int):String{
    var stmt= "Hi, my name is $x and I am $y years old"
 return stmt
}


//Write a function that takes in a String and returns its length.

fun leng(){
    var word = "Mombasa"
   println(word.length)

}

// A function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”

fun name (){
    var firstPerson = "Mercy Wacera"

    var secondPerson = "Jane wambui"
    if ( firstPerson == secondPerson){
        println("Thats me!")
    }else {
        println("I don't know who that is")
    }

}

