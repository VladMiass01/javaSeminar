public class Notebook {

    private int vol_OZU;
    private int vol_HDD;
    private String oper_OS;
    private String col_Book;

    public int getVol_OZU() {
        return vol_OZU;
    }

    public int getVol_HDD() {
        return vol_HDD;
    }

    public String getOper_OS() {
        return oper_OS;
    }

    public String getCol_Book() {
        return col_Book;
    }

    public void setVol_OZU(int vol_OZU) {
        this.vol_OZU = vol_OZU;
    }

    public void setVol_HDD(int vol_HDD) {
        this.vol_HDD = vol_HDD;
    }

    public void setOper_OS(String oper_OS) {
        this.oper_OS = oper_OS;
    }

    public void setCol_Book(String col_Book) {
        this.col_Book = col_Book;
    }

    public String toString() {
        return "Объем памяти: " + vol_OZU +
                ",  Объем ЖД :" + vol_HDD +
                ",  Операционная система: " + oper_OS +
                ",  Цвет: " + col_Book;
    }
}