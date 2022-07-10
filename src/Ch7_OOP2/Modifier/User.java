package Ch7_OOP2.Modifier;

public class User {
    // 디른 클래스에서 접근할 수 없도록 private 생성자로 멤버변수 선언
    private String name;
    private int age;
    private String ageGroup;
    private String contact;
    private String address;

    // 외부에서 멤버변수의 값을 읽을 수 있는 getter 메소드 선언
    public String getName() { return name; }
    public int getAge(){ return age; }
    public String getAgeGroup(){ return ageGroup; }
    public String getContact(){ return contact; }
    public String getAddress(){ return address; }

    // 외부에서 User class의 멤버변수 값을 변경할 수 있는 Setter 메소드 선언.
    // 만약 멤버변수에 특정 조건의 값을 넣어줘야 한다면 Setter에 세팅하면 됨.
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public void setAgeGroup(int age){
        switch (age/10) {
            case 0:
                ageGroup = "10세 미만";
                break;
            case 1:
                ageGroup = "10대";
                break;
            case 2:
                ageGroup = "20대";
                break;
            case 3:
                ageGroup = "30대";
                break;
            case 4:
                ageGroup =  "40대";
                break;
            default:
                ageGroup = "50대 이상";
                break;
        }
    }
}
