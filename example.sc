  //正格
  def add1(x: Int): Int = x + 1
  
  add1(1)
  
  // val x: Int = throw new Exception("すろー")
  // add1(throw new Exception("すろー"))
  

def f(x: Int): Int = x + 1
def g(x: Int): Int = x + 1
g(f(1))
// g(f(1))
// g(2)
// 3 

//非正格
def f2(x: => Int): Int = x + 1
def g2(x: => Int): Int = x + 1

g2(f2(1))


//正格関数
def addab(a: Int, b: Int, c: Int) = a + b
addab(1, 2, 3)
//cも評価される


//非正格関数
def addab2(a: => Int, b: => Int, c: => Int) = a + b
addab2(1, 2, 3)
//cは利用されないので評価されない


// ||は非正格関数 | は正格関数
true || {println("hoge"); true}
true | {println("hoge"); true}　//hogeと出力される