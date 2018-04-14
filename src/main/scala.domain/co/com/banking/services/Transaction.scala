package co.com.banking.services

import co.com.banking.entities.{Account, AccountLoginSecurity, PersonalAccount, TransactionSupport}

trait Transaction {

  def credit(amount: Double, account: Account[TypeAccountT], personalAccount: PersonalAccount): TransactionSupport
  def debit(amount: Double, personalAccount: PersonalAccount): TransactionSupport
  def transfer(amount: Double, personalAccount: PersonalAccount, account: Account[TypeAccountT]): TransactionSupport
  def isValidLogin(accountLoginSecurity: AccountLoginSecurity): Boolean

}


