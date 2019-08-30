package BankApplication.DSL.implementations

import BankApplication.DSL.BankAccountDSL
import BankApplication.models.{BankError, models}

class BankAccountDB[F[_]] extends BankAccountDSL[F] {

  def apply[F]: BankAccountDB[F] = new BankAccountDB()
}
