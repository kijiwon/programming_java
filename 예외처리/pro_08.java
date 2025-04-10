class ExceptionTest
{
    ExceptionTest(){
        try{
            method(); // 실행 -> 예외 발생 안함 -> 다음 코드 실행
            System.out.print(" A "); // A
        } catch(Exception e){ // 오류 발생하지 않음
            System.out.print(" B");
        } finally{ // 항상 실행
            System.out.print(" C "); // C
        }
        System.out.print(" D"); // D
    }
    void method(){} // 빈 메소드 => 예외 발생X
    public static void main(String[] args){
        ExceptionTest t = new ExceptionTest();
        // [실행 결과] A C D
    }
}