// pro_13
class Connection{
    private static Connection _inst = null; // 정적 변수 _inst
    private int count = 0; 
    static public Connection get(){ // static 메소드
        if(_inst == null){
            _inst = new Connection();
            return _inst;
        }
        return _inst;
    }
    public void count(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
public class Main{
    public static void main(String[] args){
        Connection conn1 = Connection.get();
        // _int = null 이므로 새로운 Connection 객체를 생성 => _inst = new Connection();
        conn1.count(); // -> count = 1
        Connection conn2 = Connection.get();
        // _inst는 conn1에서 생성한 Connection 객체가 들어있음 => 그대로 반환 
        conn2.count(); // count = 2
        Connection conn3 = Connection.get();
        // _inst는 conn1에서 생성한 Connection 객체가 들어있음 => 그대로 반환 
        conn3.count(); // count = 3
        conn1.count(); // count = 4
        System.out.print(conn1.getCount()); // 4
    }
}