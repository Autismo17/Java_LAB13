package task2;

public class Tester
{
    public String name;
    public String surname;
    public int expirienceInYears;
    public int englishLevel;
    public int salary;

    public Tester(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    public Tester(String name, String surname, int expirienceInYears,int englishLevel)
    {
            this(name, surname);
            this.expirienceInYears = expirienceInYears;
            this.englishLevel = englishLevel;
    }
    public Tester(String name, String surname, int expirienceInYears,int englishLevel, int salary)
    {
        this(name, surname, expirienceInYears, englishLevel);
        this.salary = salary;
    }

    public void hello()
    {
        System.out.println("Hello!");
    }
    public void bye()
    {
        System.out.println("Buy!");
    }
    public void hey()
    {
        System.out.println("Hey!");
    }
}
