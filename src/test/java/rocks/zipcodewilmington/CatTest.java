package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setName(){
//        Given
        Cat cat = new Cat("Whiskers",null,null);
        String expectedName = "Whiskers";

//        When
        cat.setName("Whiskers");
        String actualName = cat.getName();
//        Then
        Assert.assertEquals(expectedName,actualName);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        Cat cat = new Cat("Whiskers",null,null);
        String expectedSpeak = "meow!";
//        When
        String actualSpeak =cat.speak();
//        Then
        Assert.assertEquals(expectedSpeak,actualSpeak);


    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        Cat cat = new Cat("Whiskers",new Date(),null);
//        Given
        Date date = new Date(2020,12,25);
        Date expectedBirthDate = date;
//        When
        cat.setBirthDate(date);
        Date actualBirthDate = cat.getBirthDate();
//        Then
        Assert.assertEquals(expectedBirthDate,actualBirthDate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        Cat cat = new Cat("Whiskers",new Date(),null);
        Food food = new Food();

//        When
        cat.eat(food);
        boolean actualFood = cat.getNumberOfMealsEaten()>0;

        Assert.assertTrue(actualFood);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
//        Given
        Cat cat = new Cat("Whiskers",new Date(),87);
        Integer expectedId = 87;
        Integer actualId = cat.getId();
        Assert.assertEquals(expectedId,actualId);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInstance(){
        Cat cat = new Cat("Whiskers",new Date(),87);
        Assert.assertTrue(cat instanceof Animal);

    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
        @Test
        public void testMammalInheritance(){
            Cat cat = new Cat("Whiskers",new Date(),87);
            Assert.assertTrue(cat instanceof Mammal);
        }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }



}
