class Parent {
    public Parent(){
        System.out.println("A");
        hMethod(); // 자식 클래스에서 오버라이딩된 hMethod 호출
    }
    public void hMethod(){
        System.out.println("B");
    }
}

class Child extends Parent {
    private String message = "C";
    public void hMethod(){ 
        System.out.println(message);
    }
}

class Test {
    public static void main(String[] args){
        Parent obj = new Child(); // Parent 타입의 Child 인스턴스 생성
        // obj가 생성되면서 Child() 호출 -> 부모 클래스의 기본 생성자 호출 => A 출력 후 hMethod()호출
        // hMethod()는 Child 클래스에서 오버라이딩 -> Child 클래스의 hMethod 호출 -> message가 정의되기 이전에 호출되었음 => null
        // [출력 결과] A
        //          null
    }
}