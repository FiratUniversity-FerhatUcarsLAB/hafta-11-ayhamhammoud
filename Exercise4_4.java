public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber(); 
        // Cevap: Metot bir deger donduruyor ama biz kullanmiyoruz.
        // Java hata vermez, program calisir. IDE bazen uyarı gösterebilir ("result of method call ignored").

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Cevap: Bu hata verir!
        // Hata mesaji: "bad operand types for binary operator '+'"
        // Nedeni: sayHello() void donuyor, toplama islemi yapilamaz.

        // Dogru kullanım ornegi:
        sayHello(); // dogru, sadece cagirilir
        int number = getNumber(); // dogru, donen deger kullanildi
    }
}
