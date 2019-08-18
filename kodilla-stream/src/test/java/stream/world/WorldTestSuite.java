package stream.world;

import com.kodilla.stream.sand.Europe;
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
        World worldall = new World();

        //when
        worldall.addContinent(new Continent(new Country("Poland", new BigDecimal("40000000"))));
        worldall.addContinent(new Continent(new Country("Argentina", new BigDecimal("112000000"))));
        worldall.addContinent(new Continent(new Country("Republic of Sounth Africa", new BigDecimal("60000000"))));

        BigDecimal totalPeople = worldall.getPeopleQuantity().stream()
                .map(World::getPeopleQuantity)


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
