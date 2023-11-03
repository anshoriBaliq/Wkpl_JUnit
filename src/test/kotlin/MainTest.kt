import kotlin.test.Test
import kotlin.test.assertEquals

internal class MainTest {

    private val testSample: Main = Main()

    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }
}