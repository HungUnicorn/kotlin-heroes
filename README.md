# kotlin-heroes

https://www.jetbrains.com/promo/kotlin-heroes/

Run and assert the code in kotlin script

### Useful ways for reading parameters
```kotlin
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
```
