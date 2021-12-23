

/*topics:
    - trimMargin and TrimIndent
    - в тройных кавычках не требюуется экранирование значений
    -
 */
fun main() {
    println("Hello!\nLet's start!")
    val fSyntax = FunctionSyntax()
    fSyntax.defValues()
    println(fSyntax.printingSmthngLikeLyambda())
    //and with parameters
    println(fSyntax.printingSmthngLikeLyambda("Something")) //true
    println("""Hey!
        |
    """.trimMargin())
}