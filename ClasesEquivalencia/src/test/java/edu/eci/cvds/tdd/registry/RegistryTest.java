package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
        Person person = new Person("Cesar Ramos",1947265,46,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void deadRegistryResult() {
        Person person = new Person("Diego Rodriguez",2348973,70,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void underageRegistryResult() {
        Person person = new Person("Sarita Segura",11839482,17,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void invalidAgeRegistryResult() {
        Person person = new Person("Diana Maso",1482852050,-12,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void duplicatedRegistryResult() {
        Person person = new Person("Juan Jara",13482049,29,Gender.MALE,true);
        registry.registerVoter(person);
        Person person2 = new Person("Luis Martinez",13482049,27,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person2);

        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
}
