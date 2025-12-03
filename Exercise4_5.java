public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred); // fred değerini yazdırır
        if (bob == 5) {
            ping("not "); // bob 5 ise ping fonksiyonunu çağırır
        } else {
            System.out.println("!"); // değilse "!" yazdırır
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;

        zoop("just for", bizz); // ilk çağrı
        clink(2 * buzz);        // ikinci çağrı
    }

    public static void clink(int fork) {
        System.out.print("It's ");      
        zoop("breakfast ", fork); // zoop ikinci çağrı
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more "); // ping çıktısı
    }
}

// Stack diyagramı (zoop ikinci çağrı sırasında):
// -----------------------------------
// | zoop("breakfast", 4)         |
// |  • fred = "breakfast"        |
// |  • bob = 4                   |
// -----------------------------------
// | clink(4)                     |
// |  • fork = 4                  |
// -----------------------------------
// | main(args)                    |
// |  • bizz = 5                  |
// |  • buzz = 2                  |
// -----------------------------------

// Programın tam çıktısı:
// just for
// any not more 
// It's !
