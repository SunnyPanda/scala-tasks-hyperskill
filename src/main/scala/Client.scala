/*
* We developed a class to account for clients, but some of the code was lost! Restore the code considering
* the following conditions:
* The repository must have a method for getting the number of clients.
* The repository should not give access to internal fields.
* We want to see the history of changes, so when adding a new client, the old repository should remain unchanged.
*/
class Client(name: String)

class Repository(clients: List[Client]) {
  def add(client: Client): Repository = new Repository(clients :+ client)
  def size: Int = clients.size
}
