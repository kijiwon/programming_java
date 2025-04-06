class A {
    public static void display(){
        System.out.print("A");
    }
}
class B extends A {
    public static void display(){ 
        System.out.print("B");
    }
}
class C extends B {
    public static void display(){
        System.out.print("C");
    }
}
class Test {
    public static void main(String[] args){
        A obj1 = new A();
        A obj2 = new B();
        A obj3 = new C();

        // static이 붙은 함수 + 동일한 형태 => 하이딩
        // 하이딩에서는 변수의 타입을 따라감 -> A 클래스의 display를 호출
        obj1.display(); // A
        obj2.display(); // A
        obj3.display(); // A
    }
}