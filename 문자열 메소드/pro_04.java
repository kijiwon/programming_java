class Main{
    public static void main(String[] args){
        String str1 = "Java";
        String str2 = "java";

        System.out.println(str1.equals(str2)); // 문자열이 동일한지? => false
        System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 무시하고 동일한지? => true
        System.out.println(str1.compareTo(str2));
        // 두 문자열을 유니코드 값을 기준으로 비교
        // J와 j는 A와 a가 떨어진 만큼 떨어져 있음 -> 65 - 97 = -32
    }
}