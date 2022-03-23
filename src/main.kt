fun main(){
    var person1=Human("Nyakuar" ,22 ,"62")
    println("I am eating food of 80 kg")
//    person1.weight


//    println("person1")
    var cto=user("Nyakuar", "Gatwech", "gatwech@gmail.com", 715965457,"nhial")
   println(cto.email )
    println(cto.firstname)
    var y = person1.speak("I love kotlin ")
    println(y)
    var boy=person1.birthday()
    println(boy)


}

 class Human(var name: String, var age: Int, var weight: String ){
     fun eat(foodwight: Int): String {
         weight +=foodwight
     println("I am eating $foodwight  kgs food")
         return weight
     }
     fun birthday():Int{
         var newAge=age+1
         return newAge
     }


     fun speak(speech: String):String{
         return speech
     }

 }


data class user(var firstname:String, var lastname: String, var email: String, var phonenumber: Int,var password: String){

}

