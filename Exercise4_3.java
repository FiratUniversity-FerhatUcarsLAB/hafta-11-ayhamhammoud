// Q1: Stack Diagram (ping() first call)
// -------------------------------------
// | ping()      |  • no local vars    |
// -------------------------------------
// | baffle()    |  • no local vars    |
// -------------------------------------
// | zoop()      |  • no local vars    |
// -------------------------------------
// | main(args)  |  • args: String[]   |
// -------------------------------------

public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

// Q2: Program Output (exactly)
//
// No, I wug.
// You wugga wug.
// I wug.
//





