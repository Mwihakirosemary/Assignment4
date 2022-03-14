fun main (){
multi(arrayOf(15,20,4))
    stateement(arrayOf("Laptop",20.5,15,17.2F,5,5.5,true))
    createArray(arrayOf('a','e','r','i','o','u','b','z','x'))
}
fun multi(num: Array<Int>): Int {
    var product = 1
    num.forEach { mn ->
        if (mn is Int) {
            product *= mn
        }
    }
    println(product)
    return product
}
fun stateement(line: Array<Any>): Double {
    var sum = 0.0
    line.forEach { j ->
        if (j is Double || j is Float) {
            sum += j.toString().toDouble()
        }
    }
    println(sum)
    return sum
}
fun createArray(vowels: Array<Char>): Int{
    var number = 0
        vowels.forEach { g ->
            if (g=='a'||g=='e'||g=='i'||g=='o'||g=='u'){
                number += g.toString().count()

        }
        }
    println(number)
    return number

    }

