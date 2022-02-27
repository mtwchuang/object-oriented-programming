public class Week1 
{
    public void tutorialQ2()
    {
        System.out.println("Hello, I am Matthew Chuang");
        String coursecode = "CSC1009";
        switch(coursecode)
        {
            case "CSC2902":
            {
                System.out.println("Career and Professional Development");
                break;
            }

            case "CSC1006":
            {
                System.out.println("Mathematics II");
                break;
            }
            case "CSC1007":
            {
                System.out.println("Operating System");
                break;
            }
            case "CSC1008":
            {
                System.out.println("Data Structures and Algorithms");
                break;
            }
            case "CSC1009":
            {
                System.out.println("Object Oriented Programming");
                break;
            }
        }
        for(int i = 102; i>=66;i--)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
        }
    }
}
