package stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //given
        World worldall = new World();

        //when
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country("Poland", new BigDecimal("40")));
        europeCountries.add(new Country("Germany", new BigDecimal("60")));
        europeCountries.add(new Country("France", new BigDecimal("82")));

        List<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country("China", new BigDecimal("1600")));
        asiaCountries.add(new Country("Indie", new BigDecimal("1100")));
        asiaCountries.add(new Country("South Korea", new BigDecimal("75")));

        List<Country> africaCountries = new ArrayList<>();
        africaCountries.add(new Country("PRA", new BigDecimal("100")));
        africaCountries.add(new Country("Jemen", new BigDecimal("20")));
        africaCountries.add(new Country("Nigeria", new BigDecimal("25")));

        Continent europe = new Continent(europeCountries);
        Continent asia = new Continent(asiaCountries);
        Continent africa = new Continent(africaCountries);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //when
        BigDecimal totalPeople = world.getPeopleQuantity();
        //then

        Assert.assertEquals(new BigDecimal("3102"), totalPeople);

    }
}