class Student {

    String name;
    int id;


    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Roohan", 101);
        Student s2 = new Student("Sadik Chotu", 102);

        s1.display();
        s2.display();
    }
}