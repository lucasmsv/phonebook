package dao;

public class Pessoa implements Comparable<Pessoa> {
    
    private String name, telephone, city;
    
    public Pessoa(){}
    
    public Pessoa(String _name, String _telephone, String _city) {
        this.name = _name;
        this.telephone = _telephone;
        this.city = _city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int compareTo(Pessoa _pessoa) {
        return this.name.compareTo(_pessoa.getName());
    }

}
