class KrzyzowkaKaczka extends Kaczka{
    public KrzyzowkaKaczka(){
        kwakanieInterfejs=new Kwacz();
        latanieInterfejs=new LatamBoMamSkrzydla();
    }
    @Override
    public void wyswietl() {
        System.out.println("Jestem kaczką krzyżówką");
    }
}
