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
				case Some => user.gender 
				case None => None
			}
		} yield gender

		userArray.map(user => user.gender).foreach(gender => println(gender))

	}

}
