public class Kert {
    Maci maci;
    Cica cica;
    public void inditElet() {
        initObject();
        startMaci();
        startCica();
    }
    public void initObject() {
        this.maci= new Maci();
        this.cica= new Cica();
    }
    public void startMaci() {
        maci.hangotAd("Brummm..");
        maci.mezgyujtes();
        //maci.nev="Koda";
    }
    public void startCica() {
        cica.hangotAd("Nya");
        cica.dorombol();
        cica.beallitNev("");
        //cica.nev="Mirci";
        //System.out.println(cica.nev);
    }
}
