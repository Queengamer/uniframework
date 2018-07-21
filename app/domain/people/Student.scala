package domain.people
import play.api.libs.json.Json
/**
  * By Yandisa Katiya - 2018/07/21
  */


case class Student(studentId: String, deptId: String, firstName:String, lastName: String, initial: String, email: String) 
{
  object Student
  {
    implicit val studentJson = Json.format[Lecturer]
  }
}
