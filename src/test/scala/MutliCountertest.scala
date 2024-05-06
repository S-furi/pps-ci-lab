import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals

import counter.MultiCounter

class MutliCountertest:

  @Test def testMultiCounterCreation: Unit =
    val c = MultiCounter()
    assertNotNull(c)

  @Test def testMutliIncrement: Unit =
    val c = MultiCounter()
    c.inc(10)
    assertEquals(10, c.getValue())
