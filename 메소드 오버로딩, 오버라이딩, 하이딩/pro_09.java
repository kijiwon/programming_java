class Parent {
    public void set_name(String param_n){
        System.out.print("A");
    }
    public void set_age(int param_i){
        System.out.print("B");
    }
}

class Child extends Parent{
    public void set_name(String param_n){ // 부모 클래스와 동일한 형태의 메소드 -> 메소드 오버라이딩
        System.out.print("C");
    }
    public void set_height(int param_h){
        System.out.print("D");
    }
    public static void main(String[] args){
        Child c = new Child(); // Child 클래스의 인스턴스
        c.set_name("홍길동"); // Child 클래스의 set_name 호출 => C
        c.set_age(40); // Parent 클래스의 set_age 호출 => B
        c.set_height(170); // Child 클래스의 set_height 호출 => D
    }
}