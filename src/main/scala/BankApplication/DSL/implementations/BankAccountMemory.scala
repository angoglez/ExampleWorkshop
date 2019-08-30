package BankApplication.DSL.implementations

import BankApplication.DSL.BankAccountDSL
import BankApplication.models.{BankError, models}

class BankAccountMemory[F[_]] extends BankAccountDSL[F] {

  def apply[F]: BankAccountMemory[F] = new BankAccountMemory()

}
