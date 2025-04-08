class Parent {
    int x = 3;
    int getX(){
        return x * 2;
    }
}
class Child extends Parent {
    int x = 7;
    int getX(){
        return x * 3;
    }
}
class Main {
    public static void main(String[] args){
        Parent b1 = new Child(); // Parent 타입, Child 인스턴스
        Child b2 = new Child(); // Child 타입, Child 인스턴스
        System.out.print(b1.getX() + b1.x + b2.getX() + b2.x);
        // b1.getX() -> Parent 클래스의 getX를 호출(x) 함수는 Child에서 오버라이딩되어 Child 클래스의 getX 호출 => 21
        // b1.x -> Parent 클래스의 x를 참조 => 3
        // b2.getX() -> Child 클래스의 getX 호출 => 21
        // b2.x -> Child 클래스의 x를 참조 => 7
        // [출력 결과] 52
    }
}