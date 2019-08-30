package BankApplication.DSL

import BankApplication.DSL.implementations.{BankAccountDB, BankAccountMemory}
import BankApplication.models.models._

trait BankAccountDSL[F[_]] {

  def createBankAccount(name: String,
                        pinCode: PinCode,
                        clientId: ClientId): F[Option[BankAccount]]

  def getBalance(accountId: AccountId, pinCode: PinCode): F[Option[Double]]

  def makeDeposit(accountId: AccountId, ammount: Double): F[Option[Double]]

  def makeWithdraw(accountId: AccountId, ammount: Double):F[Option[Double]]

  def makeTransfer(source: AccountId,
                   destination: AccountId,
                   ammount: Double): F[Option[Double]]

}

object BankAccountDSL {

  def memoryImp[F[_]]: BankAccountDSL[F] = new BankAccountMemory[F]

  def dbImp[F[_]]: BankAccountDSL[F] = new BankAccountDB[F]

}
