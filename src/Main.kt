fun main() {
    val n = 10 // Replace with the desired number of primes
    val primes = generatePrimes(n)
    println("The first $n prime numbers are: $primes")
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun generatePrimes(n: Int): List<Int> {
    val primes = mutableListOf<Int>()
    var number = 2
    while (primes.size < n) {
        if (isPrime(number)) {
            primes.add(number)
        }
        number++
    }
    return primes
}
