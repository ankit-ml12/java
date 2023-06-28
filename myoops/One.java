
public class One {
  public static void main(String[] args) {
    Ankit temp = new Ankit(10, "ankit");
    System.out.println(temp.num);
    System.out.println(temp.name);
    
  }
}

class Ankit {
  int num;
  String name;
  Ankit(int n, String na){
num = n;
name = na;
  }
}