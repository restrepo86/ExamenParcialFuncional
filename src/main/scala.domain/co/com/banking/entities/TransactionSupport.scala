package co.com.banking.entities

import java.util.Date

import co.com.banking.services.{BalanceInquiry, TypeAccountT}

case class TransactionSupport (

                                ticketNumber: Int,
                                dateTransaction: Date,
                                typeTransaction: String,
                                BalanceInquiry: BalanceInquiry,
                                amount: Double

                              )

