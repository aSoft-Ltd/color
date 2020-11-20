import tz.co.asoft.Color
import tz.co.asoft.ColorSpaces
import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertEquals

class SyntaxCheckTest {
    @Test
    @JsName("test_01")
    fun `should create a color in rgb space`() {
        val color1 = Color(0xFF000000)
        assertEquals(color1.colorSpace, ColorSpaces.Srgb)

        val color2 = Color(0xFFFF0000)
        assertEquals(color2.colorSpace, ColorSpaces.Srgb)
        val (r, g, b) = color2
        assertEquals(r, 1f)
    }
}