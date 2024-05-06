object UseCounter:

  @main def main(): Unit =
    import counter.* 

    val c = Counter()
    c.inc()
    c.inc()
    c.inc()

    println(s"Counter value is: ${c.getValue()}")
