package color

import kotlinx.css.rgba

operator fun Color.invoke() = rgba(red.to255Int(), green.to255Int(), blue.to255Int(), alpha.toDouble())
