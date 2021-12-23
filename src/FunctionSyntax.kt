class FunctionSyntax {
    fun defValues(a: Int = 0, s: String = "Empty") = println("""a is ${a}, s is ${s}
    and I wanna
    print it!
    """)



    fun printingSmthngLikeLyambda(s: String = "Empty") : Boolean = (s.equals("Something"))

}