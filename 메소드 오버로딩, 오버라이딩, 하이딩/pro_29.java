class Parent {
    public static void display(){
        System.out.print("A");
    }
}
class Child extends Parent {
    public static void display(){
        System.out.print("B");
    }
}
class Test {
    public static void printDisplay(Parent obj){ // 매개변수를 Parent 타입으로 형변환 => 참조 변수의 타입을 Parent로 간주
        obj.display();
    }
    public static void main(String[] args){
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        Child obj3 = new Child();
        printDisplay(obj1); // A
        printDisplay(obj2); // A
        printDisplay(obj3); // A
    }
}