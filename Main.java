import java.util.*;
class Main {
    String phone_number;
    String email_address;
    String name;
    String address;
    public Main
            (
                    String n, String a, String p, String e)
    {   name = n;
        address = a;
        phone_number = p;
        email_address = e;}
    public String toString() {
        return  name + " Person";}
}
class Student0 extends Main
{   final String a1 = "Freshman";
    final String a2 = "Sophomore";
    final String a3 = "Junior";
    final String a4 = "Senior";
    public Student0(String n, String a, String p, String e)
    {
        super(n, a, p, e);
    }
    public String toString()
    {
        return name + " Student";
    }
}
class Employee0 extends Main
{   String office;double salary;
    Date date_hired = new Date();
    public Employee0(
            String n, String a, String p, String e, String o, double s)
    {   super(n, a, p, e);this.office = o;this.salary = s;}
    public String toString() {
        return name + " Employee";}
}
class Faculty0 extends Employee0 {
    double work_hour; String rank;
    public Faculty0(
            String n, String a, String p, String e, String o, double s, double w, String r)
    {
        super(n, a, p, e, o, s);
        this.work_hour = w;
        this.rank = r;}
    public String toString()
    {
        return name + " Faculty";}
}
class Staff0 extends Employee0 {    String title;
    public Staff0(String n, String a, String p, String e, String o, double s, String t)
    {
        super(n, a, p, e, o, s); title = t;}
    public String toString() {
        return name + " Staff";}
    public static void main(String[] args)
    {Main p = new Main("MD ASHIKUR RAHMAN = ",
            "Bangladesh",
            "13107736607",
            "ashikurrahman@hdu.edu.cn ");
        System.out.println(p.toString());
        Student0 s = new Student0("Rakin = ",
                "Pakistan",
                "57514381517",
                "rakin@gmail.com");
        System.out.println(s.toString());
        Employee0 e = new Employee0("Roki = ", "India", "76324278734", "roki@gmail.com","Dorm 35 room 604", 399999);
        System.out.println(e.toString());
        Faculty0 f = new Faculty0("Riva = ", "Nepal", "54583871885", "Riva@gmail.com",
                "room201",1000000, 8, "leader");
        System.out.println(f.toString());
        Staff0 sta = new Staff0("Roni = ", "52528482645", "3000313", "roni444@gmail.com",
                "dorm 37-808", 29000, "Lidar");
        System.out.println(sta.toString());}
}