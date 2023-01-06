case class TargetId(value: Int)

case class Action(amount: Int, message: String)

case class Message(
                    messageId: Long,
                    targetId: TargetId,
                    action: Action,
                  )

object Comparison {
  def areTheSameMessages(first: Message, second: Message): Boolean = first == second
}
