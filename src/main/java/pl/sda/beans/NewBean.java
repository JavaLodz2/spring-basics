package pl.sda.beans;

/**
 * Created by Marian on 2017-03-11.
 */
public class NewBean {

    private FirstBean firstBean;
    private SecondBean secondBean;
    private int number;

    public NewBean(FirstBean firstBean, SecondBean secondBean, int number) {
        this.firstBean = firstBean;
        this.secondBean = secondBean;
        this.number = number;
    }

    public FirstBean getFirstBean() {
        return firstBean;
    }

    public SecondBean getSecondBean() {
        return secondBean;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
