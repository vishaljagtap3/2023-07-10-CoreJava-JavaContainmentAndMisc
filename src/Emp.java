public class Emp {
    private int id;
    private String name;
    private Date dob;

    public Emp(int id, String name, int day, int month, int year) {
        this.id = id;
        this.name = name;
        this.dob = new Date(day, month, year);
    }

    public void display() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("dob = " + dob.getDay() + "-" + dob.getMonth() + "-" + dob.getYear());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        Date newDob = new Date(dob.getDay(), dob.getMonth(), dob.getYear());
        return newDob;
        //return dob; //not good
    }

    /*public void setDob(Date dob) {
        this.dob = dob;
    }*/
}
