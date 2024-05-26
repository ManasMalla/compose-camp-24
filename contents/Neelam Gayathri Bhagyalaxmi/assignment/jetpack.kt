1--->
fun main() {
         println("1")
         println("january")
         println("monday")
         println("holiday")
     }

2---->
fun main() { 
    println("New chat message from a friend'}
}
correct program
fun main() { 
    println("New chat message from a friend")
}

3---->
fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
correct program
fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
output - Sale - Up to 20% discount on Google Chromecast! Hurry up!

4---->
fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
corrct program 
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
output - The total party size is: 50
 5---->
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
output - Congratulations for your bonus! You will receive a total of 5000 + 1000 (additional bonus).
 
6---->
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    println("$firstNumber + $secondNumber = $result")
}
output - 10+5=15

9---->
fun main() {
    val Steps = 4000
    val caloriesBurned = TOcalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories") 
}

fun TOcalories(NumberOFStepS: Int): Double {
    val forEachStep = 0.04
    val CALORIESburned = NumberOFStepS * forEachStep
    return CALORIESburned
}
output - Walking 4000 steps burns 160.0 calories

10---->
fun compareScreenTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
fun main() {
    val timeSpentToday = 300
    val timeSpentYesterday = 250
    val result = compareScreenTime(timeSpentToday, timeSpentYesterday)
    println("Did you spend more time today? $result")
}
output - Did you spend more time today? true

11---->
fun printWeather(city: String, lowTemp: Int, highTemp: Int, rainChance: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rainChance%")
    println()
}

fun main() {
    printWeather("Ankara", 27, 31, 82)
    printWeather("Tokyo", 32, 36, 10)
    printWeather("Cape Town", 59, 64, 2)
    printWeather("Guatemala City", 50, 55, 7)
}
output - City: Ankara
Low temperature: 27, High temperature: 31
Chance of rain: 82%

City: Tokyo
Low temperature: 32, High temperature: 36
Chance of rain: 10%

City: Cape Town
Low temperature: 59, High temperature: 64
Chance of rain: 2%

City: Guatemala City
Low temperature: 50, High temperature: 55
Chance of rain: 7%
  
12---->
Use the val keyword when the value doesn't change.
Use the var keyword when the value can change.
When you define a function, you define the parameters that can be passed to it.
When you call a function, you pass arguments for the parameters.

