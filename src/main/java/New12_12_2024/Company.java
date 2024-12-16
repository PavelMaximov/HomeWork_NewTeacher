package New12_12_2024;

public class Company {
    private int id;
    private String name;
    private String address;

    public Company(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Company() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        check(id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void check(int param) {
        if(param < 1) {
            System.out.println("ID has tobe positive integer!!!");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Company company = new Company(1, "Google", "1600 Amphitheatre Parkway, Mountain View, CA");
        System.out.println(company);
    }
}