public class DebugTask5 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        updateAge(person);
        System.out.println("Updated age: " + person.getAge());
    }
    public static void updateAge(Person person) {
        int age = person.getAge();
        person.setAge(age+1);
    }
}