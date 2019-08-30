package BankApplication.DSL

import BankApplication.DSL.implementations.{BankAccountDB, BankAccountMemory}
import BankApplication.models.BankError
import BankApplication.models.models.BankAccount

trait BankAccountDSL[F[_]] {

  def createBankAccount(name: String,
                        pinCode: String,
                        clientId: Long): F[Option[BankAccount]]

  def getBalance(accountId: Long, pinCode: String): F[Option[Double]]

  def makeDeposit(accountId: Long, ammount: Double): F[Option[Double]]

  def makeWithdraw(accountId: Long, ammount: Double):F[Option[Double]]

  def makeTransfer(accountIdSource: Long,
                   accountIdDestination: Long,
                   ammount: Double): F[Option[Double]]

}

object BankAccountDSL {

  def memoryImp[F[_]]: BankAccountDSL[F] = new BankAccountMemory[F]

  def dbImp[F[_]]: BankAccountDSL[F] = new BankAccountDB[F]

}
