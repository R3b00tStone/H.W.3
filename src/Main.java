public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Anna", "Malas", Gender.FEMALE, 1, "Math");
        Student student2 = new Student("John", "Doe", Gender.MALE, 2, "History");
        Student student3 = new Student("Emily", "Smith", Gender.FEMALE, 3, "Science");
        Student student4 = new Student("Michael", "Johnson", Gender.MALE, 4, "English");
        Student student5 = new Student("Olivia", "Williams", Gender.FEMALE, 5, "Physics");
        Student student6 = new Student("William", "Brown", Gender.MALE, 6, "Chemistry");
        Student student7 = new Student("Sophia", "Davis", Gender.FEMALE, 7, "Biology");
        Student student8 = new Student("James", "Jones", Gender.MALE, 8, "Computer Science");
        Student student9 = new Student("Ava", "Taylor", Gender.FEMALE, 9, "Geology");
        Student student10 = new Student("Alexander", "White", Gender.MALE, 10, "Engineering");
        Student student11 = new Student("Vasiliy", "Star", Gender.MALE, 11, "Engineering");

        Group groupName = new Group ("BX-1");

        System.out.println(groupName);

        try {
            groupName.addStudent(student1);
            groupName.addStudent(student2);
            groupName.addStudent(student3);
            groupName.addStudent(student4);
            groupName.addStudent(student5);
            groupName.addStudent(student6);
            groupName.addStudent(student7);
            groupName.addStudent(student8);
            groupName.addStudent(student9);
            groupName.addStudent(student10);

            groupName.removedStudentById(10);

            groupName.addStudent(student11);

            System.out.println(groupName);

        } catch (GroupOverflowException e) {
            System.out.println("Group Overflow");
            e.printStackTrace();
        }
        try {
            System.out.println(groupName.searchStudentByLastName("Persi")); // <-- Вылетит исключение
        } catch (StudentNotFoundException e) {
            e.printStackTrace();
        }
    }
}