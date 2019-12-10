
class ClassSuper {
    protected int i1;
    protected int i2;

  public ClassSuper (int i1, int i2) {
    this.i1 = i1;
    this.i2 = i2;
  }

  public void calc(){
    System.out.println("i1 + i2 =" + (i1 + i2));
  }
}

class ClassSub extends ClassSuper {
    public ClassSub (int i1, int i2) {
      super(i1, i2);
    }

    @override
    public void calc(){
      System.out.println("il * i2 =" + (i1 * i2));
      super.calc();
    }
  }

    public class Main {
      public static void main(String[] args) {
        classSub cs = new ClassSub(3, 5);
        cs.calc();
    }
}

/*https://www.sejuku.net/blog/22798*/
// class ClassSuper {
//   protected int i1 = 3;
//   protected int i2 = 5;

//   public void calc () {
//     System.out.println("i1 + i2 =" + (i1 + i2));
//   }
// }

// class ClassSub extends ClassSuper {
//   @override
//   public void calc () {
//     System.out.println("i1 + i2 =" + (i1 * i2));
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     ClassSub cs = new ClassSub();
//     cs.clac();
//   }
// }

