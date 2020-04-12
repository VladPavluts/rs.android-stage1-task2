package subtask4

class Pangram {

    fun getResult(inputString: String): String {
        val isPangram = ('a'..'z').all { inputString.toLowerCase().contains(it)}
        val vowels = listOf( 'a', 'e', 'i', 'o', 'u', 'y' )
        val consonants = ('a'..'z').filter { it !in vowels }
        val inString: String
        if(isPangram){
            var wordsOfInputString: List<String> = inputString.split(" ")
            wordsOfInputString = wordsOfInputString.filter { "" != it }
            val listOFpairs = mutableListOf<Pair<Int, String>>()
            wordsOfInputString.forEach { word: String ->
                var newW = ""
                var i = 0
                word.forEach { char: Char -> if (char.toLowerCase() in vowels) {
                        i += 1
                        newW += char.toUpperCase()
                    } else { newW += char }
                }
                listOFpairs.add(listOFpairs.filter { it.first <= i }.size, Pair(i, i.toString() + newW))
            }
            val result = mutableListOf<String>()
            listOFpairs.forEach { pair -> result.add(pair.second)}
            return result.joinToString(" ")
        }
        else{
            inString=inputString.replace("\n", " ").replace("\r", " ")
            var wordsOfInString: List<String> = inString.split(" ")
            wordsOfInString = wordsOfInString.filterNot { "" == it }
            val listOfPairs2 = mutableListOf<Pair<Int, String>>()
            wordsOfInString.forEach { word: String ->
                var newW2 = ""
                var i = 0
                word.forEach { char: Char -> if (char.toLowerCase() in consonants) {
                        i += 1
                        newW2 += char.toUpperCase()
                    } else {
                        newW2 += char
                    }
                }
                listOfPairs2.add(listOfPairs2.filter { it.first <= i }.size, Pair(i, i.toString() + newW2))
            }
            val result = mutableListOf<String>()
            listOfPairs2.forEach { pair ->result.add(pair.second) }
            return result.joinToString(" ")
        }
    }
}
