package co.com.banking.entities

import co.com.banking.services.AccountStatus

case class Account[TypeAccountT](accountNumber: Integer, accountHolder: Client, address: Address, accountStatus: AccountStatus)

