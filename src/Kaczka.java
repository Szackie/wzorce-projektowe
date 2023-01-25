public abstract class Kaczka {

    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;

    public abstract void wyswietl();

    public void wykonajLec(){
        latanieInterfejs.lec();
    }
    public void wykonjKwacz(){
        kwakanieInterfejs.kwacz();
    }
    public void plyn(){
        System.out.println("Wszystkie kaczki pływają nawet te sztuczne");
    }
    public void ustawLatanieInterfejs(LatanieInterfejs li){
        latanieInterfejs=li;
    }
    public void ustawKwakanieInterfejs(KwakanieInterfejs ki){
        kwakanieInterfejs=ki;
    }

}
