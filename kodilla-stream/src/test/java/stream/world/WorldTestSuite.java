package stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //given
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country germany = new Country("Germany", new BigDecimal("52000000"));
        Country
        List<World> worldAll= new ArrayList<>();

        //when
        worldAll.add(new Continent(new Country("France", new BigDecimal("125000000")))));
        worldAll.add(new World(new Continent(new Country("Serbia", new BigDecimal("1250000")))));
        worldAll.add(new World(new Continent(new Country("Montenegro", new BigDecimal("25000000")))));

        BigDecimal totalPeople = worldAll.stream()
                .map(World::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        }

        //then

    }
}

/*    BigDecimal totalSand = continents.stream()
            .map(SandStorage::getSandBeansQuantity)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    //then
    BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand,totalSand);*/
