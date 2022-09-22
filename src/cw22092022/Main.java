package cw22092022;

public class Main {
    public static void main(String[] args) {
        Country nameCountry = new Country();
        nameCountry.setName("Span");
        nameCountry.setContinent("Europe");
        nameCountry.toString();

        City nameCity = new City();
        nameCity.setName("Madrid");
        nameCity.setCountry("Spain");
        nameCity.setCountOfPeople(100005);
        nameCity.toString();

        City nameCityOfMadrid = new City();
        nameCityOfMadrid.setName("Barcelona");
        nameCityOfMadrid.setCountry("Spain");
        nameCityOfMadrid.setCountOfPeople(8955);
        nameCityOfMadrid.toString();

        Country nameCountry1 = new Country();
        nameCountry1.setName("Czehia");
        nameCountry1.setContinent("Europe");
        nameCountry1.toString();

        City nameCity1 = new City();
        nameCity1.setName("Praha");
        nameCity1.setCountry("Czehia");
        nameCity1.setCountOfPeople(80050);
        nameCity1.toString();

        System.out.println(nameCountry.toString());
        System.out.println(nameCity.toString());
        System.out.println(nameCityOfMadrid.toString());
        System.out.println(nameCountry1.toString());
        System.out.println(nameCity1.toString());

    }


}
