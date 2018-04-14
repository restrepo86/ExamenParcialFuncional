package co.com.banking.entities


case class Account[TypeAccountT](accountNumber: Integer, accountHolder: Client, address: Address)

