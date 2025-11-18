public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {

    /*
     * Programa honetan debugerra erabili dezakegu ikusteko System.out.println("");
     * Funtzioaren funtzionamendua ikusteko
     * 
     * Ikusi nahi badugu nola funtzionatzen duen barrutik breakpoint bat ezartzen
     * dugu, run eta debugg ematen dugu eta breakpointean geldituko da
     * Breakpointan gelditzean lau atal aterako dira (Variables,Watch,Call Stack eta
     * breakpoints) bariabletan klikatzean Local aterako da eta Local barruan
     * args=Stirng[0]@9
     * Goian ateratzen den menuan step into klikatzen badugu ikusiko dugu
     * bariablearen funtzionamendua barrutik ' if (getClass() == PrintStream.class)
     * {'
     * 
     * Breakpoint bat baino gehiago erabilita egin dezakezuna da kodea por partes
     * ikustea, continue ematen edo F5 hurrengo breakpointera joango da.
     */

    public static void main(String[] args) throws Exception {

        /*
         * Lehendabizi eskakizun operazionalak zer diren azalduko det, horretarako
         * System.out.println("#"); erabiliko det
         * horrela run ematean ejekutatuko da eta idatzi dudan textua agertuko da
         * Klientearekiku ikusgarri geratzeko \n erabiliko det linea bat salto egiteko
         */
        System.out.println("Eskakizun operazionalak");
        System.out.println("\n Zer dira?");

        System.out.println("Esakakizun operazionalak dira , baliabide batzuk beahr direnak lan egiteko");

        /*
         * Hemen programa informatikoa software eta hardware azaltzen ditut.
         * 
         */
        System.out.println(koloreak.PURPLE+"Programa informatikoa, software, hardware..."+koloreak.RESET);
        System.out.println(koloreak.GREEN+"\n Zer da?"+koloreak.RESET);

        System.out.println(
                "\n Software eta hardwarea dira bizitza ematen diotenak ordenagailu bat, hardware da adibidez disko gogorra, pantaila, gauz fisikoak dira eta software dira driverrak, ram bezalakoak.");
        System.out.println(
                "\nPrograma informatiko bat, adibidez java bat html web bat, kodea bidez egina daude, lehen codea 0101 bezalakoak ziren binarioa erabiltzen zela eta orain print bezalako bariableak erabiltzen dira, \nbariable honen atzean atzean binarioa dago soilik eta orain ulergarriagoa da eta errezagoa.");

    }
}
