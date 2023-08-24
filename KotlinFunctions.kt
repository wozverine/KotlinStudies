fun main(){
  println("Hello!")
} // A unit function
		
fun sum(a: Int, b: Int): Int {
  return a + b
} // A function with integer parameters

fun sayHello(name: String) {
  println("Hello, $name")
} // A function with String parameter
		
fun petMaker(name: String = "Doggo", age: Int, isVaxxed: Boolean = false) {
  print("$name / $age / $isVaxxed")
} //Function with mix of regular and default arguments
	
petMaker(age = 2) //Using just the non-default argument
petMaker("BB",age = 3,true)
//or can be
petMaker(name= "BB",age = 3, isVaxxed =  true)
		
fun sum(a: Int, b: Int): Int {
  return a + b
} //function with parameters and return value
		
fun sumSingle(a: Int, b: Int): Int = a + b //A single-expression function 
		
fun doMath(mathOperation: (Int, Int) -> Int, a: Int, b: Int): Int {
	return mathOperation(a, b)
} //A function that accepts another function as input
println(doMath(::sum, 2 ,3)) //prints 5
