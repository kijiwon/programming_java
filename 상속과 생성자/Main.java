// pro_02
class Parent {
    void parentMethod(){
        System.out.println("Parent 클래스의 parentMethod 호출");
    }
}

class Child extends Parent{
    void childMethod(){
        System.out.println("Child 클래스의 childMethod 호출");
    }
}

public class Main{
    public static void main(String[] args){
        Parent obj = new Child(); // obj는 Parent 타입 변수로 선언됨 -> child 메소드에는 접근할 수 없음
        obj.parentMethod();
        // obj.childMethod(); → 오류! 
    } 
}