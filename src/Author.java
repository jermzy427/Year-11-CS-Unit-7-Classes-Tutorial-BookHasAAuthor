import javax.xml.namespace.QName;

public class Author {
    private String name;
    private char gender;
    private String email;

    public Author(String name, char gender, String email){
        this.name = name;
        this.email = email;
        if((gender != 'm')&&(gender != 'f')){
            throw new IllegalArgumentException("Gender must be make or female");
        }
        else{
            this.gender = gender;;
        }

    }

    public String getName(){
        return this.name;
    }

    public char getGender(){
        return this.gender;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ") " + "at " +email;
    }
}


