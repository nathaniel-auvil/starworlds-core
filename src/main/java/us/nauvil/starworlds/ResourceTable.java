package us.nauvil.starworlds;


import java.util.TreeSet;


public class ResourceTable {

    private TreeSet<Resource> resources;

    public ResourceTable() {
        this.resources= new TreeSet<Resource>( new ResourceComparator() );
    }

    public void addResource( Resource r ) {
        this.resources.add( r );
    }

    
    @Override
    public String toString() {
        return resources.toString();
    }


}
