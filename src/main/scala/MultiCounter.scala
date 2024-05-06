package counter;

trait MultiCounter:
  def inc(by: Int): Unit
  def getValue(): Int

object MultiCounter:
  def apply(initValue: Int = 0): MultiCounter = new MultiCounterImpl(initValue)

  private class MultiCounterImpl(private val initValue: Int = 0) extends MultiCounter:
    import counter.Counter

    private val c: Counter = new Counter(initValue)
    override def inc(by: Int): Unit = (0 until by) foreach (x => c.inc())

    export c.getValue
