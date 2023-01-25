class ModelowaKaczka extends Kaczka{
    public ModelowaKaczka(){
        latanieInterfejs=new NieLatam();
        kwakanieInterfejs=new Kwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem modelową kaczka!");
    }

}
