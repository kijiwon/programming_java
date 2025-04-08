class A {
    int a = 10;
    public A(){
        System.out.print("가");
    }
    public A(int x){
        System.out.print("나");
    }
    public static void main(String[] args){
        B b1 = new B(); // B 타입, B 클래스 인스턴스 => B()호출 -> A() 먼저 호출 => 가다 출력
        A b2 = new B(1); // A 타입, B 클래스 인스턴스 => B(1)호출 -> A() 먼저 호출 (왜? 따로 명시하지 않은 경우 기본 생성자를 호출) => 가라 출력
        System.out.print(b1.a + b2.a); // b1.a => B 타입을 참조 => 20, b2.a => A 타입 참조 => 10
        // [출력 결과] 가다가라30
    }
}
class B extends A{
    int a = 20;
    public B(){
        System.out.print("다");
    }
    public B(int x){
        System.out.print("라");
    }
}