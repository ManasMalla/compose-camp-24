2. Print messages
fun main() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

3. Fix compile error

fun main() { 
    println("New chat message from a friend")
}

4. String templates

fun main() {
    val discountPercentage: Int = 20  
    val item : String = "Google Chromecast"
    val offer: String = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    
    println(offer)
}

5. String concatenation


fun main() {
    val numberOfAdults :Int = 20
    val numberOfKids:Int = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

6. Message formatting

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

7.Implement basic math operations

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(firstNumber: Int, secondNumber:Int):Int{
    return firstNumber+secondNumber
    
}
fun subtract(firstNumber:Int,thirdNumber:Int):Int{
    return firstNumber-thirdNumber
    
}


8. Default parameters

fun displayAlertMessage(operatingSystem:String,emailId:String):String{
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId ." 
}
fun main() {
    val firstUserEmailId = "user_one@gmail.com"
    val firstUserOperatingSystem ="Unknown User"
    println(displayAlertMessage(firstUserOperatingSystem,firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}


9.Pedometer

fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepstoCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories") 
}

fun pedometerStepstoCalories(numberOfStep: Int): Double {
    val caloriesBurnedforEachStep = 0.04
    val totalCaloriesBurned = numberOfStep* caloriesBurnedforEachStep
    return totalCaloriesBurned
}

10. Compare two numbers

fun main(){
    println(compareScreenTime(300,250))
     println(compareScreenTime(300,300))
      println(compareScreenTime(200,220))
}
fun compareScreenTime(timeSpentToday:Int,timeSpentYesterday:Int):Boolean{
    return timeSpentToday>timeSpentYesterday
}

11. Move duplicate code into a function
fun main() {
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}