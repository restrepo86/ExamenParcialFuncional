package co.com.banking.entities

import java.util.Date

import co.com.banking.services.{BalanceInquiry, TypeAccountT}

case class TransactionSupport (

                                ticketNumber: Integer,
                                dateTransaction: Date,
                                typeTransaction: String,
                                residue: BalanceInquiry,
                                amount: Double,
                                account: Account[TypeAccountT],
                                personalAccount: PersonalAccount

                              )

