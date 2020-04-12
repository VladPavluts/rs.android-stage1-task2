package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        var f1=0
        var f2=1

        while(f1*f2 <= n){
            if(f1*f2==n)
                return intArrayOf(f1,f2,1)
            val tmp=f1
            f1=f2
            f2+=tmp
        }
        return intArrayOf(f1,f2,0)
    }
}
