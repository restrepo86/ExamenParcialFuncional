package co.com.banking.services

import co.com.banking.entities.{Account, PersonalAccount, TransactionSupport}

sealed trait TypeAccountT
case object Check extends TypeAccountT
case object Savings extends TypeAccountT
case object Fiduciary extends TypeAccountT

class BankingService extends Transaction{

  override def credit(amount: Double, account: Account[TypeAccountT]): Nothing = ???

  override def debit(amount: Double, personalAccount: PersonalAccount): TransactionSupport = ???

  override def transfer(amount: Double, personalAccount: PersonalAccount, account: Account[TypeAccountT]): TransactionSupport = ???
}
