case class Counter(count: Int) {
  def increase: Counter = Counter(count + 1)
}