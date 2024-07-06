class Student{
    String name;
    int rollno;
    int age;
    String address;
    

    Student(String Name,int Rollno,int Age,String Address){
        this.name = Name;
        this.rollno = Rollno;
        this.age = Age;
        this.address = Address;
}
}
 class Constructor {

    public static void main(String[] args) {
        
        Student s1 = new Student("vaishnavi", 8, 22, "Kolhar");
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.age);
        System.out.println(s1.address);
    }
    
}
