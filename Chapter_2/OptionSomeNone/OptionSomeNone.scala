object OptionSomeNone { 

	def main(args: Array[String]): Unit = {

		optionsExample()

	}

	case class User(name: String, gender: Option[String])

	def optionsExample(): Unit = {

		val userOne = User("James", Option("Male"))
		val userTwo = User("Other User", None)

		println("User one: " + userOne.gender.getOrElse("Not Specified"))
		println("User two: " + userTwo.gender.getOrElse("Not Specified"))

		val userArray = Array(userOne, userTwo)

		val genders = for {
			user <- userArray
			gender <- user.gender match {
				case None => None
				case _ => user.gender
			}
		} yield gender

		genders.foreach(gender => println(gender))

	}

}
