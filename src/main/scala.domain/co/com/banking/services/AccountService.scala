package co.com.banking.services

sealed trait AccountStatus
case object Active extends AccountStatus
case object Closed extends AccountStatus

class AccountService {

}
