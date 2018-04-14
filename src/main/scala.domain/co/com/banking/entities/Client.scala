package co.com.banking.entities

case class Client(

  idType: String,
  identificationNumber: Int,
  name:String,
  lastName: String,
  age: Int,
  cellPhone:String,
  email: String,
  address: String,
  stratum: Int

)

