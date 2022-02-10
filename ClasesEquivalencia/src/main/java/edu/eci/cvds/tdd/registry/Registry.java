package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
    /**
     * ArrayList of registered persons to vote.
     */
    private ArrayList<Integer> idRegistrados = new ArrayList<Integer>();

    /**
     * Check if the person has a valid status to vote.
     * @param p Person who's going to vote.
     * @return Status of the person.
     */
    public RegisterResult registerVoter(Person p) {
        RegisterResult result = RegisterResult.VALID;
        if(!p.isAlive()){
            result = RegisterResult.DEAD;
        }else if(p.getAge() < 0){
            result = RegisterResult.INVALID_AGE;
        }else if(p.getAge() < 18){
            result = RegisterResult.UNDERAGE;
        }else if(idRegistrados.contains(p.getId())){
            result = RegisterResult.DUPLICATED;
        }
        
        if(result.equals(RegisterResult.VALID)){
            idRegistrados.add(p.getId());
        }
        return result;
    }
}
