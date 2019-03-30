package love.programming;

public class JavaCountryClass {

    public String countryName;
    public String continentName;
    public int population;
    public double valueOfCountry;

    public JavaCountryClass(){
        this("countryName","continentName");

    }

    public JavaCountryClass(String countryName){
        countryName = countryName;
        System.out.println(countryName);
    }

    public JavaCountryClass(String countryName, String continentName){
        this.countryName = countryName;
        this.continentName = continentName;
        System.out.println(countryName+continentName);
    }

    public JavaCountryClass(String countryName, String continentName, int population, double valueOfCountry){
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.valueOfCountry = valueOfCountry;
        System.out.println(countryName+continentName+population+valueOfCountry);
    }
}
