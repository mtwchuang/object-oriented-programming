import java.util.Date;
public class GeometricObject 
{
    // attributes
    Date date = new Date();
    protected String color;
    protected boolean filled;
    protected Date dateCreated;
    // constructors
    public GeometricObject()
    {
        this.color="white";
        this.filled = false;
        this.dateCreated=date;
    }
    public GeometricObject(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
        this.dateCreated=date;
    }
    // getters and setters
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString()
    {
        String output = "created on "+ getDateCreated()+"\ncolor: white and filled: ";
        if(getColor()=="white" && isFilled()==true)
        {
            return (output+ "true");
        }
        else
        {
            return (output+ "false");
        }
    }
}
