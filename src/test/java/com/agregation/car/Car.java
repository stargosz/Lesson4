package com.agregation.car;
import com.agregation.country.Country;
import com.agregation.dimension.Dimension;
import com.agregation.market.Market;
import com.agregation.producent.Producent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "isAutomaticGear=" + isAutomaticGear +
                ", segment='" + segment + '\'' +
                ", producent=" + producent +
                ", dimension=" + dimension +
                ", market=" + market +
                ", country=" + country +
                '}';
    }

    boolean isAutomaticGear;
    String segment;
    Producent producent;
    Dimension dimension;
    Market market;
    Country country;

    public Car(boolean isAutomaticGear, String segment, Producent producent, Dimension dimension, Market market, Country country) {
        this.isAutomaticGear = isAutomaticGear;
        this.segment = segment;
        this.producent = producent;
        this.dimension =  dimension;
        this.market = market;
        this.country = country;
    }

    public void setAutomaticGear(boolean automaticGear) { isAutomaticGear = automaticGear; }

    public Boolean getAutomationGear() { return isAutomaticGear; }

    public String getSegment() { return segment; }

    public void setSegment(String segment) { this.segment = segment; }

    public Producent getProducent() { return producent; }

    public void setProducent(Producent producent) { this.producent = producent; }

    public Dimension getDimension() { return dimension; }

    public void setDimension(Dimension dimension) { this.dimension = this.dimension; }

    public Market getMarket() { return market; }

    public void setMarket(Market market) { this.market = market; }

    public Country getCountry() { return country; }

    public void setCountry(Country country) { this.country = country; }

    public List<Integer> getTrunkCapacity() { return getTrunkCapacity(); }

    public static void main(String[] args) {

        Country Poland = new Country("Poland", 'P');
        Country Us = new Country("United States", 'U');
        Country Germany = new Country("Germany", 'G');
        Country England = new Country("England", 'U');
        Country China = new Country("China", 'C');

        Market Europe = new Market("Europe", Arrays.asList(England, Germany, Poland));
        Market English = new Market("US", Arrays.asList(Us, England, Germany));
        Market Asia = new Market("Asia", Arrays.asList(China, Us, Germany));
        Market BigCountires = new Market("English", Arrays.asList(England, Us, China));
        Market Europe_Asia = new Market("Europe", Arrays.asList(England, Poland, China));

        Dimension dSmall = new Dimension(75, 7, 160);
        Dimension dLarge = new Dimension(87, 9, 180);
        Dimension dBig = new Dimension(98, 10, 400);
        Dimension dTruck = new Dimension(98, 11, 360);
        Dimension dCompact = new Dimension(76, 9, 300);
        Dimension dVerySmall = new Dimension(53, 6, 120);
        Dimension dVeryBig = new Dimension(58, 12, 600);
        Dimension dBigTruck = new Dimension(87, 11, 560);
        Dimension dNormal = new Dimension(96, 9, 320);
        Dimension dMonster = new Dimension(100, 16, 1000);
        List<Dimension> dimensions = new ArrayList<>();
        dimensions.add(dSmall);
        dimensions.add(dLarge);
        dimensions.add(dBig);
        dimensions.add(dTruck);
        dimensions.add(dCompact);
        dimensions.add(dVerySmall);
        dimensions.add(dVeryBig);
        dimensions.add(dNormal);
        dimensions.add(dMonster);
        dimensions.add(dBigTruck);


        Producent Mercedes = new Producent("Mercedes", "GLK 220");
        Producent BMW = new Producent("BMW", "x7");
        Producent Kia = new Producent("Kia", "Ceed");
        Producent BMW1 = new Producent("BMW", "M5");
        Producent Mercedes1 = new Producent("Mercedes", "ML 500");
        Producent BMW2 = new Producent("BMW", "M3");
        Producent BMW3 = new Producent("BMW", "X1");
        Producent Opel = new Producent("Opel", "Insignia");
        Producent Volvo = new Producent("Volvo", "XC-90");
        Producent Jaguar = new Producent("Jaguar", "X-Type");

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(true, "premium", Mercedes, dimensions.get(2), Europe, Germany));
        cars.add(new Car(true, "premium", BMW, dimensions.get(9), Europe, Us));
        cars.add(new Car(false, "premium", Kia, dimensions.get(0), English, Poland));
        cars.add(new Car(false, "standard", Opel, dimensions.get(4), Asia, China));
        cars.add(new Car(false, "premium", Volvo, dimensions.get(3), Europe, England));
        cars.add(new Car(true, "medium", BMW1, dimensions.get(8), English, Germany));
        cars.add(new Car(false, "standard", Jaguar, dimensions.get(7), BigCountires, China));
        cars.add(new Car(true, "premium", BMW, dimensions.get(6), Europe, Poland));
        cars.add(new Car(false, "standard", Opel, dimensions.get(1), English, Us));
        cars.add(new Car(false, "standard", BMW3, dimensions.get(2), Europe_Asia, Us));
        cars.add(new Car(true, "premium", Jaguar, dimensions.get(7), Asia, Poland));
        cars.add(new Car(true, "medium", Mercedes1, dimensions.get(4), BigCountires, Germany));
        cars.add(new Car(true, "premium", Volvo, dimensions.get(3), English, Germany));
        cars.add(new Car(false, "standard", BMW2, dimensions.get(1), Europe, Poland));
        cars.add(new Car(true, "medium", Kia, dimensions.get(5), Europe_Asia, England));

        System.out.println("-------------------------------------------------------- \n" +
                "We produce BMWs with automation gear and trunk capacity over 300l in: ");
        for (Car c : cars) {
            String producentModel = c.getProducent().getModel();
            if (producentModel.equals("BMW")) {
                Boolean gear = c.isAutomaticGear;
                if (gear) {
                    int trunkCapacity = c.getDimension().getTrunkCapacity();
                    if (trunkCapacity > 300){
                        System.out.println(c.getCountry().getCountryName() + " - " + c.getCountry().getCountrySign());
                    }
                }
            }
        }
    }
}
