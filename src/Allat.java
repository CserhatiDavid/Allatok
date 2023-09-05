public class Allat {
    private String nev="Nevtelen";
    //get
    public void beallitNev(String nev){
        if (nev.isEmpty()) {
            System.out.println("Nem adtál meg nevet.");
            System.exit(1);
        }
        this.nev=nev;
    }
    //set
    public String lekerNev(){
        return this.nev;
    }
    public void hangotAd(String hang){
        System.out.println(hang);
    }
}
