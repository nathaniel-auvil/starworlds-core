package us.nauvil.starworlds;

import java.util.Comparator;

public class ResourceComparator implements Comparator<Resource>{

    @Override
    public int compare(Resource o1, Resource o2) {
       int result= Double.compare(o1.getOdds(), o2.getOdds());

       //--set can not have duplicates. in my case i do not care. too lazy to use right data type.
       //if(result == 0) result = 1;

       return result;
    }

}
