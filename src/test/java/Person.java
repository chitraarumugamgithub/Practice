class Person{

    String name;

    Person(String name){
        this.name = name;
    }

}
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        /*we used Person class and we didn’t override the .equals() method so it used the default .equals()
         method of Object class,
         and thus you got false as an output despite having the same value.
         */
      //  Person p1 = new Person("ashay");
      //  Person p2 = new Person("ashay");
/*we are using String object and String class has overridden the .equals() method and they override in a way that
it should compare value. Originally, .equals() is present in Object class and String class by default extend
Object class so String class can override the .equals() method of an object class
 */
        String p1= new String("ashay");
        String p2= new String("ashay");

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
    }
}
