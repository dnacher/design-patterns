package behavioralPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersonList = new ArrayList<Person>();
        for(Person person: persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersonList.add(person);
            }
        }
        return malePersonList;
    }
}
