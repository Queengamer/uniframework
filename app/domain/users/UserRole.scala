package domain.users

import java.time.LocalDateTime

import domain.security.RolesID
import play.api.libs.json.Json

case class UserRole(orgId: String,
                    emailId: String,
                    date: LocalDateTime,
                    roleId: String)

object UserRole {
  implicit val userroleFmt = Json.format[UserRole]

  def identity: UserRole = UserRole(" "," ", LocalDateTime.now(), RolesID.STUDENT)
}
