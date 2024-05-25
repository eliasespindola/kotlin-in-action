package `cap-one`

data class Person(val name: String, val age: Int? = null)
fun main(){
    var persons = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is ${oldest}")
}