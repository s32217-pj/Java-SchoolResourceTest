package c5;

public class Equipment extends SchoolResource{
    protected String location;
    public boolean isFunctional;

    

    public Equipment(int resourceID, String resourceName, String description, String location, boolean isFunctional) {
        super(resourceID, resourceName, description);
        this.location = location;
        this.isFunctional = isFunctional;
    }

    public void relocate(String newLocation){
        this.location = newLocation;
    }

    public void repair(){
        this.isFunctional = true;
    }

    @Override
    public String getResourceDetails(){
        return "Equipment{Location: "+location+" Is Functional: "+isFunctional+" " +super.getResourceDetails() +"}";
    }

    protected void allocateResource(){
        totalResources++;
    }

    public String getLocation() {
        return location;
    }

    public boolean isFunctional() {
        return isFunctional;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setFunctional(boolean isFunctional) {
        this.isFunctional = isFunctional;
    }
}