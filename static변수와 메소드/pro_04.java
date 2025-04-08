class Student{
    String id;
    String name;
    static int count = 0; // static 변수 -> 공유
    Student(String id, String name){
        this.id = id;
        this.name = name;
        this.count++; // static 변수 수정
    }
    public void print(){
        System.out.println(this.id + " : " + this.name + " : " + count);
    }
}
class Studenttest {
    public static void main(String[] args){
        Student st1 = new Student("001", "Lee");
        // Student("001", "Lee") 호출 => st1.id = "001" , st1.name = "Lee", count = 1
        Student st2 = new Student("002", "Kim");
        // Student("002", "Kim") 호출 => st2.id = "002", st2.name = "Kim", count = 2 <- st1의 count도 2
        st1.print(); // 001 : Lee : 2
        st2.print(); // 002 : Kim : 2
    }
}