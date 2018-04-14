package co.com.banking.entities

case class Credit(

  creditClient: Client,
  typeCredit: String,
  creditApproved: Double,
  numberInstallments: Int,
  valueInstallments: Double,
  numberPendingFees: Int,
  outstandingBalance: Double,
  delinquentBalance: Double,
  numberOfInstallmentsInArrears: Int,
  interestForMonthlyDelinquency: Double
)



