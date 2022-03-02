public class Outer3 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class In {
                void display() {
                    System.out.println("display: outer_x=" + outer_x);
                }

            }
            In inner = new In();
            inner.display();
        }
    }
}

class InnerClassDemo2 {
    public static void main(String args[]) {
        Outer3 outer = new Outer3();
        outer.test();
    }
}
