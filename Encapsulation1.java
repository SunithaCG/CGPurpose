package org.example.sunitha.Oops;

public class Encapsulation1 {
    public static void main(String[] args){
        Person person1=new Person();
       // person1.name="sunitha";
       // person1.age=32;
        person1.setName("Sunitha");
        person1.setAge(32);
        System.out.println("Output for given username is:"+person1.getName());
        System.out.println("Output for givern userage is:"+person1.getAge());
        person1.speak();
        person1.play();

        Person person2=new Person();
        // person1.name="sunitha";
        // person1.age=32;
        person2.setName("Jaanu");
        person2.setAge(11);
        System.out.println("Output for given username is:"+person2.getName());
        System.out.println("Output for givern userage is:"+person2.getAge());
        person2.speak();
        person2.play();
    }
}
class Person {
     //private String name;
    private String loginname;//just checking by changing the name here and observe the same in main
   private int age;

   public void setName(String userName)
   {
      //name=userName;
       loginname=userName;
   }
   public String getName()
   {
       return loginname;
   }
   public void setAge(int userAge)
   {
       age = userAge;
   }
   public int getAge()
   {
       return age;
   }

void speak()
{
   //System.out.println("My name is " +name+ "and my age is"  +age);
    System.out.println("My name is" +loginname+ " and my age is" +age);
}
void play()
{
    System.out.println("I love playing");
}
}