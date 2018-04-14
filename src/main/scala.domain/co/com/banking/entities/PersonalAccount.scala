package co.com.banking.entities

import co.com.banking.services.{BalanceInquiry, TypeAccountT}

case class PersonalAccount(account: Account[TypeAccountT], accountLoginSecurity: AccountLoginSecurity, residue: BalanceInquiry)
