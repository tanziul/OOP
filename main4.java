public class main4{
public static void main(String[]args){

person p1=new person(name,age,email,phone,address);
teacher t1=new teacher(id,salary,designation,dept);
student s1=new students(id,cgpa,cc,csem,dept);

p1.setName("Tanziul");
p1.setAge(31);
p1.setEmail("tanziulhaque87250@gmail.com");
p1.setPhone(01763647011);
p1.setAddress("Rajshahi,Naogaon");
p1.show();


t1.setName("Nazia");
t1.setAge(29);
t1.setEmail("nazia8250@gmail.com");
t1.setPhone(0063647011);
t1.setAddress("cumilla");
t1.setId("1112");
t1.setSalary(900.00);
t1.setDesignation("Assistant professor");
t1.setDepertment("Cse");
t1.show();


s1.setName("Summer");
s1.setAge(21);
s1.setEmail("summer8250@gmail.com");
s1.setPhone(006366011);
s1.setAddress("Dhaka");
s1.setId("2221");
s1.setCgpa(4.00);
s1.setCreditsCompleted("40");
s1.setCurrentSemester("3");
s1.setDepertment("EEE");
s1.show();



  }
}
