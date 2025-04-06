class Main {
    private int a;
    public void set(int a) { this.a = a; }
    public void add(int d) { a += d; }
    public void print() { System.out.println(a);}
    public static void main(String args[]){
        Main p = new Main(); // 객체 생성
        Main q; // 아직 객체를 생성하지 않음
        p.set(10); // p.a = 10
        q = p; // q에 p객체를 할당 -> 동일한 객체를 참조
        p.add(10); // p.a = 20 = q.a
        q.set(30); // q.a = 30 = p.a
        p.print(); // 30
    }
}