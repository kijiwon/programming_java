class Animal {
    Animal(){
        System.out.print("A");
    }
    Animal(String name){
        System.out.print("B");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.print("C");
    }

    Dog(int age){
        this();
        System.out.print("D");
    }

    Dog(String name, int age){
        super("name");
        System.out.print("E");
    }

    public static void main(String[] args){
        Dog dog1 = new Dog();
        // Dog의 기본 생성자 호출 -> 부모의 기본 생성자 먼저 호출 -> AC
        Dog dog2 = new Dog(3);
        // Dog(2)-> 같은 클래스의 기본 생성자 호출 -> 부모의 기본 생성자 먼저 호출 -> ACD
        Dog dog3 = new Dog("Buddy", 5);
        // Dog("Buddy", 5) -> super("Buddy") -> BE
        // [출력 결과] ACACDBE
    }
}