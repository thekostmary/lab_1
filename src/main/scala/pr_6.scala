object pr_6 {
   def isPalindrome[A](ls:List[A]): Boolean = ls == ls.reverse
  def main (args: Array[String]) {
    print (isPalindrome(List((1, 2, 3, 2, 1))))
  }
}
//Определите, является ли список палиндромом
