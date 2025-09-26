public class person{

   private String name;
   private int age;
   private String email;
   private int phone;
   private String address;

   public person(){

   public person(String name,int age,String email,int phone,String address)
   {

    this.name=name;
    this.age=age;
    this.email=email;
    this.phone=phone;
    this.address=address;
   }

   public void setName(String name);
   {this.name=name;}
   
   public void setAge(int age);
   {this.age=age;}

   public void setEmail(String email);
   {this.email=email;}

   public void setAddress(String address);
   {
   	this.address=address;
   }

   public String getName()
   {return name;}
   
   public int getAge()
   {
   	return age;
   }

   public String getEmail()
   {
   	return email;
   }

   public int getPhone()
   {
   	return phone;
   }

   public int getAddress()
  {
  	return address;
  }


  public class Teacher extends Person{

  	protected int id;
  	protected double salary;
    protected String designation;
    protected String dept;

    public teacher(int id,double salary,String desingnation,String dept)
    {

   this.id=id;
   this.salary=salary;
   this.designation=designation;
   this.dept=dept;
   }

   public void setId(int id);
   {
   	this.id=id;
   }

   public void setSalary(String salary);
   {
   	this.salary=salary;
   }

   public void setDesignation(String designation);
   {
   	this.designation=designation;
   }

   public void setDept(String dept);{

   	this.dept=dept;
   }
    
    public int getId()
    {
    	return id;
    }

    public double getSalary()
    {
    	return salary;
    }

    public String getDesignation()
    {
    	return designation;
    }

    public String getDept()
    {
    	return dept;
    }


    System.out.println("Name"+name);
    System.out.println("Age"+age);
    System.out.println("Email"+email);



  }

   














   }

}  

