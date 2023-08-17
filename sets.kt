//An immutable set is declared using the setOf keyword and indicates a set whose values cannot change throughout a program
//setOf removes duplicates
var obsoleteTech = setOf("Rolodex", "Phonograph", "Videocassette recorder", "Video projector", "Rolodex")
print(obsoleteTech) //prints [Rolodex, Phonograph, Videocassette recorder, Video projector] 

//Unlike lists, a set is an un-ordered collection, thus we can’t use square brackets and indices to retrieve its elements.
obsoleteTech.elementAt(2) // Videocassette recorder 
//.elementAtOrNull to avoid NullPointerException
obsoleteTech.elementAtOrNull()(6) //prints "null"
