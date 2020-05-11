import kotlin.browser.document

fun main(args: Array<String>) {
    val message = "Kotlin overrides body!"
    val body = """
    <div class="test">$message</div>
    <div> 위 문자열은 kotlin으로 DOM 변형을 일으킨 결과...</div>
    <div>Template literal을 활용해서 변수를 주입시킨 결과...</div>
    """
    println(body)
    document.body?.innerHTML = body
}
