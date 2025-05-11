package za.ac.cput.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int registrationId;
    private  String  registrationNumber;
    private String registrationDate;
    
    public Registration() {
    }

    public Registration(Builder builder) {
        this.registrationId = builder.registrationId;
        this.registrationNumber = builder.registrationNumber;
        this.registrationDate = builder.registrationDate;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "registrationId='" + registrationId + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                '}';
    }
    
    public static class Builder{
        private int registrationId;
        private  String  registrationNumber;
        private String registrationDate;

        public Builder setRegistrationId(int registrationId) {
            this.registrationId = registrationId;
            return this;
        }

        public Builder setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        public Builder setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public Builder copy(Registration registration){
            this.registrationId = registration.registrationId;
            this.registrationNumber = registration.registrationNumber;
            this.registrationDate = registration.registrationDate;
            return this;
        }
        public Registration build(){
            return new Registration(this);
        }
    }
}
