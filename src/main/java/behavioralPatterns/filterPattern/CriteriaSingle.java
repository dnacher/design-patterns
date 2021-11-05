package behavioralPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersonList = new ArrayList<Person>();
        for(Person person: persons){
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
