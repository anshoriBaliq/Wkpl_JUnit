//menginport test agar bisa sitest menggunakan test
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MainTest {
//membuat variabel testMain untuk mengyimpan fungsi pada kelas Main
    private val testMain: Main = Main()

    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testMain.sum(40, 2))
    }
}