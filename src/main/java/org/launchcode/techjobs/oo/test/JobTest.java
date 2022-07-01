package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.junit.Test;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;

import static org.junit.Assert.*;



/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)


public class JobTest {

    @Test
    public void testSettingJobId() {
        Job test_job_a = new Job();
        Job test_job_b = new Job();
        assertNotEquals(test_job_a.getId(), test_job_b.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

    assertTrue(test_job.getName() instanceof String); // test job name
    assertEquals("Product tester", test_job.getName());

    assertTrue(test_job.getEmployer() instanceof Employer); // test employer
    assertEquals("ACME", test_job.getEmployer());

    assertTrue(test_job.getLocation() instanceof Location); // test location
    assertEquals("Desert", test_job.getLocation());

    assertTrue(test_job.getPositionType() instanceof PositionType); //test position type
    assertEquals("Quality Control", test_job.getPositionType());

    assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency); //test core competency
    assertEquals("Persistence", test_job.getCoreCompetency());

    }

    @Test
    public void testJobsForEquality() {
        //create jobs with identical employer, location, position type, core competency values
        Job test_job_a = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
                Job test_job_b = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(test_job_a.equals(test_job_b)); //test two jobs are equal using equals method
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine () {
        Job test_job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String test_job_string = test_job.toString();
        //assertTrue(test_job_string.charAt(0) = "\n"); // test first character is blank line
        //assertTrue(test_job_string.charAt(test_job_string.length()) = "\n");

        char firstChar = test_job.toString().charAt(0);
        char lastChar = test_job.toString().charAt(test_job.toString().length()-1);

        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');

    }
}
