public class Person{
    String name;
    int age=18;
    //Constructor with name and integer
    public Person(String name,int age) {
        this.name=name;
        this.age= age;
    }
    //Constructor with name only for to show the use of default age
   public Person(String name){
        this.name=name;
  }
    public static void main(String[] args) {
        Person person01 = new Person("Mike",20);
        System.out.println(person01.name);//mike
        System.out.println(person01.age);//20
        Person person02 = new Person("John");
        System.out.println(person02.name);//john
        System.out.println(person02.age);//default age=18,So it print 18
    }
}
