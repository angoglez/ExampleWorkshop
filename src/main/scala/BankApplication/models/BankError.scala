package BankApplication.models

sealed trait BankError

//TODO: we should model each needed error type

final case class PinNotFound(message: String) extends BankError