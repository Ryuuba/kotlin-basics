/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package geo.basics

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun compareScreenTime(time1: Int, time2: Int) : Boolean {
    return time1 > time2
}

// Fix style (Pedometer isn't an action)
fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val TotalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return TotalCaloriesBurned
}

class Basics {
    fun add(firstNumber: Int, secondNumber: Int) : Int {
        return firstNumber + secondNumber
    }

    fun subtration(firstNumber: Int, secondNumber: Int) : Int {
        return firstNumber - secondNumber
    }
    
    val printMsg : String
        get() {
            // four println functions must be used, but... 
            return ("Use the val keyword when the value doesn't change.\n" +
                    "Use the var keyword when the value can change.\n" + 
                    "When you define a function, you define the parameters that can be passed to it.\n" +
                    "When you call a function, you pass arguments for the parameters.")
        }
    val offer : String
        get() {
        var discountPercentage = 0 // Formerly declared as val
        var offer = "" // Formerly declared as val
        val item = "Google Chromecast"
        discountPercentage = 20
        offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
        return offer
    }

    val partySize: String
        get () {
            val numberOfAdults = 20 // Formerly initialized as string
            val numberOfKids = 30 // Formerly initialized as string
            val total = numberOfAdults + numberOfKids
            return "The total party size is: $total"      
        }

    val totalSalary : String
        get () {
            val baseSalary = 5000
            val bonusAmount = 1000
            val totalSalary = baseSalary + bonusAmount // formerly initialized as a string
            return "Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus)."
        }
    val totalSum : String
        get () {
            val firstNumber = 10
            val secondNumber = 5
            val thirdNumber = 8
            // formerly concatenated and added by plus operator
            val result = add(firstNumber, secondNumber)
            // formerly added by add function
            val anotherResult = subtration(firstNumber, thirdNumber)
            return ("$firstNumber + $secondNumber = $result\n" +
                    "$firstNumber - $thirdNumber = $anotherResult"
        )
        }

    var operatingSystem : String = "Unknown OS"
        set (value : String) {
            field = value
        }

    var emailId : String = ""
        set (value : String) {
            field = value
        }

    val alertMessage : String
        get () {
            return "There's a new sign-in request on ${this.operatingSystem} for your Google Account ${this.emailId}."
        }
}

fun printWeatherForCity(city: String = "Unknown city", lowTemperature: Int = 0, highTemperature: Int = 0, rainProbability: Int) : String {
    return ("City: $city\n" +
            "Low temperature: $lowTemperature, High temperature: $highTemperature\n" +
            "Chance of rain: $rainProbability%"
    )
}

fun main() {
    // Print messages
    println(Basics().printMsg)
    // Fix compile error
    println("New chat message from a friend")
    // String template
    println(Basics().offer)
    // String concatenation
    println(Basics().partySize)
    // Message formatting
    println(Basics().totalSalary)
    // Implement basic math operations
    println(Basics().totalSum)
    // Default parameters
    val par1 = Basics()
    par1.operatingSystem = "Pop!_OS"
    par1.emailId = "dr.ryuuba@gmail.com"
    println(par1.alertMessage)
    val par2 = Basics()
    // par2.operatingSystem gets its default value
    par2.emailId = "test@gmail.com"
    println(par2.alertMessage)
    val par3 = Basics()
    par3.operatingSystem = "Mac OS"
    par3.emailId = "user_three@gmail.com"
    println(par3.alertMessage)
    // Pedometer
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
    // Compare two numbers
    val timeSpentToday = 300
    val timeSpentYesterday = 250
    val doYouStendMuchTime = compareScreenTime(timeSpentToday, timeSpentYesterday)
    println("Do you spend much time in your phone? R. $doYouStendMuchTime")
    // Move duplicate code into a function
    println("${printWeatherForCity(city = "Ankara", highTemperature = 31, lowTemperature = 27, rainProbability = 82)}")
    println("${printWeatherForCity("Tokyo", 32, 36, 10)}")
    println("${printWeatherForCity("Cape Town", 59, 64, 2)}")
    println("${printWeatherForCity("Guatemala City", 50, 55, 7)}")
}
