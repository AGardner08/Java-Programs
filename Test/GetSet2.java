public class GetSet2 {
    
    private String name;
    private int age;



    public String getName() {
        
        if(name.length() < 3) {
        return "Name is too small"; }
        else if (name.length() >= 17) {
            return "Name is too large";
        } else 
        return name;
    }


    public int getAge() {
        return age;
    }




    public void setName(String name ) {
        this.name = name;

    }


    public void setAge(int age ) {
        this.age = age;

    }




}
