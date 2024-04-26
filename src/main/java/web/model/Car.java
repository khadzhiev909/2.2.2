package web.model;

public class Car {
    //2. Создайте модель Car с тремя произвольными полями.
    private String series;
    private String model;
    private String color;

    public Car() {
    }

    public Car(String series, String model, String color) {
        this.series = series;
        this.model = model;
        this.color = color;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
