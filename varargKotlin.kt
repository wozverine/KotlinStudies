//from https://kotlin-quick-reference.com/130-R-vararg-parameters.html
fun printAll(vararg numbers: Int) {
    for (i in numbers) println(i)
}
printAll(1)
/*prints:
1
*/

printAll(1,2,3)
/*prints:
1
2
3
*/

//Passing in an array won’t work:
val arr = intArrayOf(1,2,3)
printAll(arr)
//error: type mismatch: inferred type is Array<Int> but Int was expected

//The solution is that you need to pass the array into your vararg parameter with this syntax:
//The * character in this use is known as the “spread operator.” The spread operator lets you convert arrays — well, most arrays — so they can be passed into a vararg parameter.
printAll(*arr)
/*prints:
1
2
3
*/

val arrayOfInt = arrayOf(1,2,3)
printAll(*arrayOfInt)
//error: type mismatch: inferred type is Array<Int> but IntArray was expected

/*intArrayOf creates a type of kotlin.IntArray, which works with a vararg parameter of type Int, 
but arrayOf creates a type of kotlin.Array, which does not work with the same vararg parameter. (This is true as of Kotlin 
version 1.2.51.)*/


fun <T> printAll(vararg elems: T) {
    for (e in elems) println(e)
}
