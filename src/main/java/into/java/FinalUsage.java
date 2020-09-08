/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package into.java;

/**
 *
 * @author wuyongbo
 */
public class FinalUsage {

    public static void main(String[] args) {
        FinalUsage f = new FinalUsage();
	f.toPrint(1);
    }   

    private void toPrint(int a) {

        Thread t = new Thread(new Runnable() {
	    @Override
            public void run() {
                int b = a + 10;
                System.out.print(b);
                System.out.print("\n");
            }
	});
        t.start();
    }
}
