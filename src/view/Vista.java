


package view;

import model.Wallet;

public class Vista {

    public static void name() {
        Wallet Wallet1 = new Wallet();
        System.out.println(Wallet1.saveMoney(300000));
        System.out.println(Wallet1.getsaldo());
    }
    
}
