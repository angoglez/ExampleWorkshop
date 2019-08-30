package BankApplication.DSL.implementations

import BankApplication.DSL.BankAccountDSL
import BankApplication.models.models

class BankAccountDB[F[_]] extends BankAccountDSL[F] {

  def apply[F]: BankAccountDB[F] = new BankAccountDB()

  def createBankAccount(name: String, pinCode: models.PinCode, clientId: models.ClientId): F[Option[models.BankAccount]] = ???

  def getBalance(accountId: models.AccountId, pinCode: models.PinCode): F[Option[Double]] = ???

  def makeDeposit(accountId: models.AccountId, ammount: Double): F[Option[Double]] = ???

  def makeWithdraw(accountId: models.AccountId, ammount: Double): F[Option[Double]] = ???

  def makeTransfer(source: models.AccountId, destination: models.AccountId, ammount: Double): F[Option[Double]] = ???
}
