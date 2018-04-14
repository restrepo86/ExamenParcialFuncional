package co.com.banking.services

import co.com.banking.entities.{Account, PersonalAccount, TransactionSupport}

trait Transaction {

  def credit(amount: Double, account: Account[TypeAccountT]): TransactionSupport
  def debit(amount: Double, personalAccount: PersonalAccount): TransactionSupport
  def transfer(amount: Double, personalAccount: PersonalAccount, account: Account[TypeAccountT]): TransactionSupport

}


