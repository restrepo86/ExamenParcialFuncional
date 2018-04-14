package co.com.banking.services

import java.util.Date


import co.com.banking.entities.{Account, AccountLoginSecurity, PersonalAccount, TransactionSupport}

sealed trait TypeAccountT
case object Check extends TypeAccountT
case object Savings extends TypeAccountT
case object Fiduciary extends TypeAccountT

class BankingService extends Transaction{

  // Preparo algunos datos para que los metodos funcionen sin persistencia =>

  val inAccountLoginSecurity = AccountLoginSecurity.apply("Restrepo7017", "123456789")


  override def transfer(amount: Double, personalAccount: PersonalAccount, account: Account[TypeAccountT]): TransactionSupport =
    //if(isValidLogin(personalAccount.accountLoginSecurity))
      //implementacion



  override def credit(amount: Double, account: Account[TypeAccountT], personalAccount: PersonalAccount): TransactionSupport = {
    val balanceInquiry = BalanceInquiry.apply(personalAccount.BalanceInquiry.residue + amount)
    TransactionSupport.apply(1, new Date, "credit", balanceInquiry, amount)
  }

  override def debit(amount: Double, personalAccount: PersonalAccount): TransactionSupport = {

    //Either left or right
    if (isValidLogin(personalAccount.accountLoginSecurity)) {

      if (amount >= personalAccount.BalanceInquiry.residue){
        val newAmount = personalAccount.BalanceInquiry.residue - amount
        val balanceInquiry = BalanceInquiry.apply(newAmount)
        TransactionSupport.apply(1, new Date, "debit", balanceInquiry, amount)

      } else {
        //Esto lo reemplazo por Either left or right ...
        TransactionSupport.apply(1, new Date, "debit", personalAccount.BalanceInquiry, amount)

      }
    } else {
      //Either left or right
      TransactionSupport.apply(1, new Date, "ErrorValidandoClave", personalAccount.BalanceInquiry, amount)
    }

  }

  override def isValidLogin(accountLoginSecurity: AccountLoginSecurity): Boolean =
    if (accountLoginSecurity.equals(inAccountLoginSecurity)) true else false

}
