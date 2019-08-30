package BankApplication.models

object models {


  case class PinCode(pinCode: String) extends AnyVal
  case class ClientId(clientId: Long) extends AnyVal
  case class AccountId(accountId: Long) extends AnyVal
  case class BankAccount(accountId: Long, clientId: Long, balance: Double)

}
