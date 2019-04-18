external fun require(module:String): dynamic

fun main(args: Array<String>) {
    val j = require("jquery")
    j("body")
        .text("jQuery message from Kotlin code")
        .append("<h1 />")
            .find("h1")
            .text("옛날 스타일로 추가한 제목!")
    println("Kotlin 비중이 너무 적어서 추가...")
}
