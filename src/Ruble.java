public class Ruble {
    private int am;
    private String ryb = "Рубль";
    private String ryb2 = "Рублей";
    private String ryb3 ="Рубля";

    public void setAm(int am){
        this.am = am;
    }
    public int getAm(){  //
        int pl = am + 9;
        int pl2 = am + 8;
        int pl3 = am + 7;
        int pl4 = am + 6;
        boolean b1 = am == 1 || pl % 10 == 0;   // рубль
        boolean b2 = pl2 % 10 == 0 || pl3 % 10 == 0 || pl4 % 10 == 0;  // рубля
        boolean b3 = am < 5 || am > 20;
        if (b1 == true && b3 == true && am % 2 != 0) {
            System.out.println(am + " " + ryb);
        } else if (b2 == true && b3 == true || am == 2){
                System.out.println(am + " " + ryb3);
            } else {
            System.out.println(am + " " + ryb2);
        }
    return am;
    }
}
