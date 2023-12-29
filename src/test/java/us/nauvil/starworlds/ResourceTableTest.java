package us.nauvil.starworlds;

import org.junit.Test;

public class ResourceTableTest {


    @Test
    public void addResources() {

        ResourceTable resourceTable= new ResourceTable();
        resourceTable.addResource( new Resource("metal", 0.5d) );
        resourceTable.addResource( new Resource("crystal", 0.5d) );

        System.out.println( resourceTable );

    }
}
