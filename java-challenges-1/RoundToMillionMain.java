import java.util.ArrayList;
import java.util.List;

public class RoundToMillionMain {
    public static void main(String[] args){
        List<City> cities=new ArrayList<City>();
        cities.add(new City("Nice", "942208"));
        cities.add(new City("Abu Dhabi", "1482816"));
        cities.add(new City("Naples", "2186853"));
        cities.add(new City("Vatican City", "572"));
//        List<City> roundCities = roundToMillionMain(cities);
//        for (City city : roundCities) {
//            System.out.println(city.getCityName() + ", " + city.getPopulation());
//        }
        System.out.println(cities);
        System.out.println(roundToMillion(cities));
    }
    public static List<City> roundToMillion(List<City> cities){
        List<City> roundCities=new ArrayList<City>();
        for(City city:cities){
            String s="";
            int population=Integer.parseInt(city.population());
            if (population<500000){
                roundCities.add(new City(city.cityName(),"0"));
            }
            else {
                int m=(int) Math.round(population/1000000.0)*1000000;
                s=s+m;
                roundCities.add(new City(city.cityName(),s));
            }
        }
        return roundCities;
    }
}
