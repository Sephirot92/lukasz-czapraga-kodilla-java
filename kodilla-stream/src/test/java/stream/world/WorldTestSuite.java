package stream.world;

import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import com.sun.corba.se.impl.orbutil.closure.Constant;
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
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("40")));
        europe.addCountry(new Country("Germany", new BigDecimal("60")));
        europe.addCountry(new Country("France", new BigDecimal("82")));

        Continent asia = new Continent();
        asia.addCountry(new Country("China", new BigDecimal("1600")));
        asia.addCountry(new Country("Indie", new BigDecimal("1100")));
        asia.addCountry(new Country("South Korea", new BigDecimal("75")));

        Continent africa = new Continent();
        africa.addCountry(new Country("PRA", new BigDecimal("100")));
        africa.addCountry(new Country("Jemen", new BigDecimal("20")));
        africa.addCountry(new Country("Nigeria", new BigDecimal("25")));

        World world = new World();
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(europe);

        //when
        BigDecimal totalPeople = world.getPeopleQuantity();
        //then

        Assert.assertEquals(new BigDecimal("3102"), totalPeople);

    }
}