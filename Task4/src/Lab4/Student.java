package Lab4;

class Student {
    private int rollNumber;
    protected char grade;
    public String name;

    public void setDetails(int roll, char g, String n) {
        this.rollNumber = roll;
        this.grade =g;
        this.name = n;
    }

    public void showDetails() {
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);
    }
}
