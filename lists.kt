var waterSports = listOf("Wind Surfing", "Sailing", "Swimming", "Jet Skiing", "Water Skiing")
// listOf() immutable
var openBroadwayShows = mutableListOf("The Lion King" "Chicago", "The Cher Show", "Les Miserables")
//mutableListOf() mutable
openBroadwayShows.size //Prints: 4

val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
planets.remove("Pluto")
planets.add("Earth")
println(planets.contains("Pluto")) //prints false
println(planets.random())
