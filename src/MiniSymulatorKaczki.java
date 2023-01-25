class MiniSymulatorKaczki {
    public static void main(String[] args){
        Kaczka dzika = new KrzyzowkaKaczka();
        dzika.wyswietl();
        dzika.wykonjKwacz();
        dzika.wykonajLec();
        Kaczka modelowa = new ModelowaKaczka();
        modelowa.wyswietl();
        modelowa.wykonajLec();
        modelowa.wykonjKwacz();
        System.out.println();
        modelowa.ustawLatanieInterfejs(new LatamZNapedemRakietowym());
        modelowa.wykonajLec();
    }
}
