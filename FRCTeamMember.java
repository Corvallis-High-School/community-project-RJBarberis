public class FRCTeamMember
{
    private String name;
    private String subteam;
    private double hours;
    private final int teamNumber = 955;

    public FRCTeamMember(String n, String s, double h) {
        name = n;
        subteam = s;
        hours = h;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Subteam: " + subteam);
        System.out.println("Hours Logged: " + hours);
        System.out.println("Team Number: " + teamNumber);
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public String getSubteam() {
        return subteam;
    }

    public double getHours() {
        return hours;
    }

    public int getTeamNumber() {
        return teamNumber;
    }
    
    public void setName(String newName) {
        name = newName;
    }

    public void setSubteam(String newSubteam) {
        subteam = newSubteam;
    }
    
    public void setHours(double newHours) {
        hours = newHours;
    }

    public String toString() {
        return "Name: " + name + ", Subteam: " + subteam +
               ", Hours: " + hours + ", Team Number: " + teamNumber;
    }

    public void addHours(double moreHours) {
        hours += moreHours;
    }

    public static void main(String[] args) {
        FRCTeamMember m1 = new FRCTeamMember("Aidan", "Programming", 42.5);
        FRCTeamMember m2 = new FRCTeamMember("Oskar", "Electrical", 30.0);

        m1.print();
        m2.print();

        System.out.println("m1 Name: " + m1.getName());
        System.out.println("m2 Subteam: " + m2.getSubteam());

        m2.setSubteam("Fabrication");
        System.out.println("m2 New Subteam: " + m2.getSubteam());

        m1.addHours(3.5);
        System.out.println("m1 New Hours: " + m1.getHours());

        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
