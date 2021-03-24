import color.Color
import color.colorspace.ColorSpaces
import color.to255Int
import kotlin.test.Test
import kotlin.test.assertEquals

class SyntaxCheckTest {
    @Test
    fun should_create_a_color_in_rgb_space() {
        val color1 = Color(0xFF000000)
        assertEquals(color1.colorSpace, ColorSpaces.Srgb)

        val color2 = Color(0xFFFF0000)
        assertEquals(color2.colorSpace, ColorSpaces.Srgb)
        assertEquals(color2.red, 1f)
    }

    @Test
    fun should_destructure_colors_properly() {
        val color3 = Color(0xFFFFAABB)
        val (r, g, b, a) = color3
        assertEquals(r.to255Int(), 0xFF)
        assertEquals(g.to255Int(), 0xAA)
        assertEquals(b.to255Int(), 0xBB)
    }
}