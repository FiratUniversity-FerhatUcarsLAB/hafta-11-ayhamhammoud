public class Exercise4_6_Multadd {

    // multadd fonksiyonu: a * b + c hesaplar
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // expSum fonksiyonu: x*e^-x + sqrt(1 - e^-x)
    public static double expSum(double x) {
        return x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
    }

    public static void main(String[] args) {
        // multadd test örnekleri
        System.out.println("multadd(2, 3, 4) = " + multadd(2, 3, 4)); // 2*3+4 = 10
        System.out.println("multadd(5, 2, 1) = " + multadd(5, 2, 1)); // 5*2+1 = 11

        // Matematiksel ifadeleri multadd ile hesaplama
        double pi = Math.PI;

        // sin(pi/4) + cos(pi/4)/2
        double result1 = multadd(Math.cos(pi/4), 0.5, Math.sin(pi/4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result1);

        // log 10 + log 20
        double result2 = multadd(Math.log(20), 1, Math.log(10)); // log 20*1 + log 10
        System.out.println("log 10 + log 20 = " + result2);

        // expSum test
        double x = 2.0;
        double result3 = expSum(x);
        System.out.println("expSum(" + x + ") = " + result3);
    }
}
