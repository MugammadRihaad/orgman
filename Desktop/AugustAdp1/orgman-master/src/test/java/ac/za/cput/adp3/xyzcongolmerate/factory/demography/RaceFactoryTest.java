package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {


    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace("Coloured");

        Assert.assertNotNull(race.getRaceId());
        System.out.println("raceId is: " + race.getRaceId());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the RaceFactory class
         * 4. Assert that the id is generated.
         */
    }
}