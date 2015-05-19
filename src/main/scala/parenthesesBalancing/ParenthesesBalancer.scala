package parenthesesBalancing

/**
 * Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a List[Char] not a String. For example, the function should return true for the following strings:
(if (zero? x) max (/ 1 x))
I told him (that it’s not (yet) done). (But he wasn’t listening)

The function should return false for the following strings:
:-)
())(

The last example shows that it’s not enough to verify that a string contains the same number of opening and closing parentheses.
Do this exercise by implementing the balance function in Main.scala. Its signature is as follows:

def balance(chars: List[Char]): Boolean

There are three methods on List[Char] that are useful for this exercise:

chars.isEmpty: Boolean returns whether a list is empty
chars.head: Char returns the first element of the list
chars.tail: List[Char] returns the list without the first element
 */
class ParenthesesBalancer {
  def balance(chars: List[Char]): Boolean = {
    lookForCharacter(chars, '(', ')')
  }
  
  def lookForCharacter(chars: List[Char], admited_char: Char, notAllowedChar: Char): Boolean = {
    if (chars.head == notAllowedChar)
      false

    if (chars.isEmpty)
      true

    if (chars.head == admited_char)
    lookForCharacter(chars.tail.reverse, notAllowedChar, admited_char)
    lookForCharacter(chars.tail, admited_char, notAllowedChar)
  }

  val test1 : String = "(if (zero? x) max (/ 1 x))"
  val parenthesisList : List[Char] = test1.toList

  parenthesisList.head
  balance(test1.toList)
  
    //chars.foreach{ println } false


}
