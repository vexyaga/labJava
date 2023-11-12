package employees;
public class emp {
    private String name;
    private String email;
    private Integer hourr;
    private Integer capacity;
    private Integer freebitch;
    private Integer calculateDailyIncome(){
        return hourr * capacity;
    }
    public void calculateMonthlyIncome(){
        System.out.println( calculateDailyIncome() * (21 - freebitch));
    }
    public emp(String name, String email, Integer hourr, Integer capacity, Integer freebitch) {
        this.name = name;
        this.email = email;
        this.hourr = hourr;
        this.capacity = capacity;
        this.freebitch = freebitch;
    }

    public emp() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getHourr() {
        return hourr;
    }

    public void setHourr(Integer hourr) {
        this.hourr = hourr;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getFreebitch() {
        return freebitch;
    }

    public void setFreebitch(Integer freebitch) {
        this.freebitch = freebitch;
    }


}
