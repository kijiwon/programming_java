class Test{
    public static void main(String[] args){ // static 메소드
        System.out.print(check(1));  // 같은 클래스 내에서 check 함수 호출 => check 함수도 static 메소드로 선언
    }
    static String check(int num){
        return (num >= 0) ? "positive" : "negative";
    }
}