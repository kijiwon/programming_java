class ClassP{
    int func1(int a, int b){
        return (a + b);
    }
    int func2(int a, int b){
        return (a - b);
    }
    int func3(int a, int b){
        return (a * b);
    }
}

class ClassA extends ClassP{
    int func1(int a, int b){ // 오버라이딩
        return (a % b);
    }
    double func2(double a, double b){ // 오버로딩
        return (a * b);
    }
    int func3(int a, int b){ // 오버라이딩
        return (a / b);
    }
    public static void main(String[] args){
        ClassP p = new ClassA(); // ClassP 클래스 타입의 ClassA 인스턴스
        System.out.println(p.func1(5,2) + "," + p.func2(5, 2) + "," + p.func3(5, 2));
        // p.func1(5, 2) -> ClassA의 func1 => 1
        // p.func2(5, 2) -> ClassP의 func2(매개변수의 타입이 int, int) => 3
        // p.func3(5, 2) -> ClassA의 func3 => 2
        // [출력 결과] 1,3,2
    }
}