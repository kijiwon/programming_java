class Parent {
    int value = 10;
    Parent(){
        value = 15;
    }
}
class Child extends Parent{
    int value = 20;
    Child(){
        super();
        value = 25;
    }
    public void printValues(){
        System.out.println("C value: " + value);
        System.out.println("P value: " + super.value);
    } 
}
class Test{
    public static void main(String[] args){
        Child obj = new Child(); // Child 타입의 Child 인스턴스
        // Child() 메소드 실행 -> Parent()실행 => Parent 클래스의 value = 15, Child 클래스의 value = 25
        obj.printValues();
        // C value: 25
        // P value: 15
    }
}