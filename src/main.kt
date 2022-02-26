fun main(){
   var campus= "akirachix"
    var chara1=campus[0]
    var chara2=campus[2]
    var chara3=campus[3]
println((chara1.toString()+chara2+chara3))
var w=nameage("mercy",23)
    println(w)

   message("i am finding kotlin so much fun!! can't wait to build applications with it. ")
    identity("mercy")

}
fun nameage(x:String,y:Int):String{
    var state=("Hi, my name is $x and i am $y years old")
    return state
}
fun message(a:String):String{
    var statement=("the length of the statement is " +a.length)
    println(statement);
    return statement
}
fun identity(name:String){
    var name1="mercy"
    var name2="mercy"
    if(name1==name2){
        println("That's me!")
    }
    else{
        println("i don't know who that is")
    }
}