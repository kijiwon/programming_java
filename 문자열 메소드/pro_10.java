class Test{
    public static void main(String[] args){
        String A1 = "23242";
        String A2 = "Hello!!";
        String B1 = A2.concat(A1); // B1 = "Hello!!23242"
        String B2 = A1.substring(4); // substring(4)-> 4번 인덱스부터 끝까지 => B2 = 2
        String B3 = Integer.toString(B1.indexOf("3")); // B1.indexOf("3") = 8, Integer.toString(8)=> 정수 8을 문자열로 변환 => B3 = "8"

        System.out.println("B1:"+ B1); // B1:Hello!!23242
        System.out.println("B2:"+ B2); // B2:2
        System.out.println("B3:"+ B3); // B3:8
    }
}