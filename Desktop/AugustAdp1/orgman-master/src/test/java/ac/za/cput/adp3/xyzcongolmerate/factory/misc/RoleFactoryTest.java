package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {


    @Test
    public void buildRole() {
        Organisation role = OrganisationFactory.buildOrganisation("Sony");

        Assert.assertNotNull(role.getOrgCode());
        System.out.println("orgCode is: " + role.getOrgCode());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the RoleFactory class
         * 4. Assert that the id is generated.
         */
    }
}