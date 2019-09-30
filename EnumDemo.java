public class EnumDemo{
  enum Days{Sun,Mon,Tue,Wed,Thu,Fri,Sat};
  public static void main(String[]args){
    Days Day1;
    Days Day2;
    Day1=Days.Mon;
    Day2= Days.Fri;
    Days x = Day1.compareTo(Day2);
  }
}
