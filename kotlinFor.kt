for (i in 1..5){
	println("i = $i")
} 
/*prints
i = 1
i = 2
i = 3
i = 4
i = 5
*/

for (i in 10 downTo 1) {
	println("i = $i")
}
/*prints
i = 10
i = 9
i = 8
i = 7
i = 6
i = 5
i = 4
i = 3
i = 2
i = 1
*/

for (j in 1 until 10) {
    println("j = $j")
}
/*prints
j = 1
j = 2
j = 3
j = 4
j = 5
j = 6
j = 7
j = 8
j = 9
*/

for (k in 1..10 step 2){
    println("k = $k")
}
/*prints
k = 1
k = 3
k = 5
k = 7
k = 9
*/

val mySchedule = listOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")
for (task in mySchedule) {
    println(task)
}
/*prints
Eat Breakfast
Clean Up
Work
Eat Lunch
Clean Up
Work
Eat Dinner
Clean Up
*/

val myTasks = setOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")
for ((taskIndex, task) in myTasks.withIndex()) {
    println("$taskIndex : $task")
}
/*prints
0 : Eat Breakfast
1 : Clean Up
2 : Work
3 : Eat Lunch
4 : Eat Dinner
*/
