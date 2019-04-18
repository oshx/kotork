external fun require(module:String): dynamic

fun main(args: Array<String>) {
    val j = require("jquery")
    j("body").text("jQuery message from Kotlin code")
}
