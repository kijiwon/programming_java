package 예외처리;

class TestException {
    public static void main(String[] args){
        try{
            System.out.print("A"); // 1. A 출력
            foo(); // foo()호출 -> 에러 발생 => catch 문으로 이동
            System.out.print("B"); 
        } catch(Exception e){
            System.out.print("C"); // 5. C 출력
        }
        System.out.print("D"); // 6. D 출력
    }
    public static void foo() throws Exception{ // throws -> 예외를 보낼 가능성이 있음
        try{
            System.out.print("E"); // 2. E 출력
            throw new Exception(); // 예외 발생 -> 예외 처리를 위해 catch 문으로 이동
        } catch(Exception e){
            System.out.print("F"); // 3. F 출력
            throw e; // 호출한 메소드(foo)로 e(에러)를 던짐
        } finally{ // 에러 유무 상관 없이 출력
            System.out.print("G"); // 4. G 출력
        }
    }
}
// [출력 결과] AEFGCD