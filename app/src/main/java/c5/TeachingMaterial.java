package c5;

public class TeachingMaterial extends SchoolResource{
    private String subject;
    public boolean isInUse;

    
    
    public TeachingMaterial(int resourceID, String resourceName, String description, String subject, boolean isInUse) {
        super(resourceID, resourceName, description);
        this.subject = subject;
        this.isInUse = isInUse;
    }

    public void checkout(){
        if(isInUse) return;
        isInUse = true;
    }
    public void checkin(){
        if(!isInUse) return;
        isInUse = false;
    }

    @Override
    public String getResourceDetails(){
        return "TeachingMaterial{Subject: "+subject+" Is in use: "+isInUse+" " +super.getResourceDetails() +"}";
    }

    protected void allocateResource(){
        totalResources++;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isInUse() {
        return isInUse;
    }
}