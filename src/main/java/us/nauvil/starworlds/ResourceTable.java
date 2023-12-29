package us.nauvil.starworlds;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ResourceTable {

    private List<Resource> resources;

    public ResourceTable() {
        this.resources = new ArrayList<Resource>();
    }

    public void addResource(Resource r) {
        this.resources.add(r);
    }

    public void sort() {
        this.resources.sort(new ResourceComparator());
    }

    public Resource getResource( double value ) {
        Iterator<Resource> i = this.resources.iterator();
        Resource prev= null, r= null;
        
        while( i.hasNext() ) {
            r= i.next();
            if( r.getOdds() > value ) {
                return prev;
            }
            else {
                prev = r;
            }
        }

        return r;
    }

    @Override
    public String toString() {
        return resources.toString();
    }

}
