package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val aUp=a.toUpperCase()
        var count=0
        var pos=0
        for(i in b.withIndex())
            for (j in aUp.withIndex()){
                if (i.value==j.value && j.index>=pos){
                    count++
                    pos=j.index
                }
            }
        return if(count==b.length)
            "YES"
        else
            "NO"
    }
}
