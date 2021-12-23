

/*topics:
    - trimMargin and TrimIndent
    - в тройных кавычках не требюуется экранирование значений
    -NULL safety:
           -элвис оператор
           -!! - кидает NPE, если нулл
           -nullable типы = ?

  Разобраться:
           fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    val email = client?.personalInfo?.email
    if (email != null && message != null)
        mailer.sendMessage(email, message)


}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

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