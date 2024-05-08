package c5;

public abstract class SchoolResource {
    public static int totalResources;
    private int resourceID;
    public int getResourceID() {
        return resourceID;
    }
    protected String resourceName;
    public String description;
    


    public String getDescription() {
        return description;
    }

    public String getResourceName(){
        return resourceName;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }


    public SchoolResource(int resourceID, String resourceName, String description) {
        this.resourceID = resourceID;
        this.resourceName = resourceName;
        this.description = description;
    }


    public String getResourceDetails(){
        return "SchoolResource{ID: "+resourceID+" Name: "+ resourceName + " Description: " +description+ "}";
    }
    protected abstract void allocateResource();
}

