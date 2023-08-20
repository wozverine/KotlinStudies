var lightColor = "red"

when (lightColor) {
	"green" -> println("Go.")
	"yellow" -> println("Slow down.")
	"red" -> println("Stop.")
	else -> println("Not a valid traffic light color.")
}
// Prints: Stop.

var num = 19
when {
	num < 0 -> println("$num is negative.")
	num == 0 -> println("$num is zero.")
	num > 0 -> println("$num is positive.")
	else -> println("Not a valid number.")
}
// Prints: 19 is positive.

var num = 5
if (num in 1..10) {
	println("This value is between 1 and 10.")
}

var letter = 'c'
when (letter) {
	in 'a'..'m' -> println("Letter is in 1st half of alphabet.")
	in 'n'..'z' -> println("Letter is in 2nd half of alphabet.")
	else -> println("Not a valid value")
}


//variable initializer is redundant error ??
