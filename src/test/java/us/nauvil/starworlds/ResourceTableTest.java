package us.nauvil.starworlds;

import org.junit.Test;

public class ResourceTableTest {


    @Test
    public void sortResources() {
        ResourceTable resourceTable= new ResourceTable();
        resourceTable.addResource( new Resource("metal", 0.05d) );
        resourceTable.addResource( new Resource("crystal", 0.04d) );
        resourceTable.addResource( new Resource("deterium", 0.01d) );

        System.out.println( "BEFORE: " + resourceTable );

        resourceTable.sort();

        System.out.println( "AFTER: " + resourceTable );
    }
}
