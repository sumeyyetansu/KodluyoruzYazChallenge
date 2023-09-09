public class hayvan {
    private int tavuk ;
    private int koyun;
    private int totalTavukBacak ;
    private int totalKoyunBacak ;
    final int tavukBacak = 2 ;
    final int koyunBacak = 4;
    final int totalBacak = 100 ;
    private int legs = 100;
    final int totalHayvan = 36 ;


    public void hayvanSayisiniBul (){
        this.koyun = (totalBacak - (tavukBacak * totalHayvan)) / 2;
        this.tavuk = totalHayvan - koyun;
        System.out.println("number of koyun is: " + koyun + " -- " + " number of tavuk is: " + tavuk);

    }
}
