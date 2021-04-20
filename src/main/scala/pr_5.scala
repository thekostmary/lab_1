object pr_5 {

      def reverse[A](ls: List[A]): List[A] = ls.reverse

    def main (args: Array[String]) {
      print (reverse(List(1, 1, 2, 3, 5, 8)))
    }
  }
/*
  Задача 5
  Переверните список
  reverse(List(1, 1, 2, 3, 5, 8))
  List[Int] = List(8, 5, 3, 2, 1, 1)
   */