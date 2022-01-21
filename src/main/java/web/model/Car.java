package web.model;

public class Car {
    private String model;
    private String series;
    private int amount;

    public Car(String model, String series, int amount) {
        this.model = model;
        this.series = series;
        this.amount = amount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    /*@Override
    public String toString() {
        return "User [" +
                "model=" + model +
                ", series='" + series + '\'' +
                ", amount='" + amount + '\'' +
                ']';
    }*/
}
