public class Students {
   public int id;
   public String name;
   public String gender;
   public int age;
   public Lop lop;
    public Students() {
    }

    public Students(int id, String name, String gender, int age , Lop lop) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.lop = lop;
    }
public Lop getLop(){
        return lop;
}
public  void  setLop(Lop lop){
        this.lop = lop;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
