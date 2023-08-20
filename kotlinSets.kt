//An immutable set is declared using the setOf keyword and indicates a set whose values cannot change throughout a program
//setOf removes duplicates
var obsoleteTech = setOf("Rolodex", "Phonograph", "Videocassette recorder", "Video projector", "Rolodex")
print(obsoleteTech) //prints [Rolodex, Phonograph, Videocassette recorder, Video projector] 

//Unlike lists, a set is an un-ordered collection, thus we can’t use square brackets and indices to retrieve its elements.
obsoleteTech.elementAt(2) // Videocassette recorder 
//.elementAtOrNull to avoid NullPointerException
obsoleteTech.elementAtOrNull()(6) //prints "null"

//mutable set is declared by mutableSetOf
var apolloLandingSites = mutableSetOf("Mare Tranquillitatis", "Fra Mauro", "Hadley/Apennines", "Descartes", "Taurus-Littrow", "Oceanus Procellarum")

var uniqueParticipants = mutableSetOf<String>() 
var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")
uniqueParticipants.addAll(participants)
println("The talent show has ${uniqueParticipants.size} unique participants.") // prints ""The talent show has 5 unique participants.""
uniqueParticipants.clear()
println(uniqueParticipants) //prints []

var testGrades = mutableSetOf(65 ,50 ,72, 80, 53, 84)
var sum = testGrades.sum()
var numStudents = testGrades.size
var average = sum / numStudents
