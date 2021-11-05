package behavioralPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersonList = new ArrayList<Person>();
        for(Person person: persons){
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersonList.add(person);
            }
        }
        return femalePersonList;
    }
}
