package us.nauvil.starworlds;

import org.junit.Test;

public class ResourceTableTest {

    @Test
    public void sortResources() {
        ResourceTable resourceTable = new ResourceTable();
        resourceTable.addResource(new Resource("metal", 50));
        resourceTable.addResource(new Resource("crystal", 40));
        resourceTable.addResource(new Resource("deterium", 10));

        System.out.println("BEFORE: " + resourceTable);

        resourceTable.process();

        System.out.println("AFTER: " + resourceTable);
    }

    @Test
    public void getResource() {
        ResourceTable resourceTable = new ResourceTable();
        resourceTable.addResource(new Resource("metal", 50));
        resourceTable.addResource(new Resource("crystal", 40));
        resourceTable.addResource(new Resource("deterium", 10));
        resourceTable.process();

        double value = 1 / 100;
        Resource r = resourceTable.getResource(value);

        System.out.println("AFTER: " + r);
    }
}
