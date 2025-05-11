package za.ac.cput.Domain;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int VehicleID;
    private String VehicleType;
    private String VehicleModel;
    private LocalDate VehicleYear;
    @ManyToOne
    @JoinColumn(name = "registration_registration_id")
    private Registration registration;

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Vehicle() {
    }
    public Vehicle(Builder builder) {
        this.VehicleID = builder.VehicleID;
        this.VehicleType = builder.VehicleType;
        this.VehicleModel = builder.VehicleModel;
        this.VehicleYear = builder.VehicleYear;
        this.registration = builder.registration;
    }

    public int getVehicleID() {
        return VehicleID;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public String getVehicleModel() {
        return VehicleModel;
    }

    public LocalDate getVehicleYear() {
        return VehicleYear;
    }

    public Registration getRegistration() {
        return registration;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleID='" + VehicleID + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", VehicleModel='" + VehicleModel + '\'' +
                ", VehicleYear=" + VehicleYear +
                ", registration=" + registration +
                '}';
    }

    public static class Builder{
        private int VehicleID;
        private String VehicleType;
        private String VehicleModel;
        private LocalDate VehicleYear;
        private Registration registration;

        public Builder setVehicleID(int vehicleID) {
            VehicleID = vehicleID;
            return this;
        }

        public Builder setVehicleType(String vehicleType) {
            VehicleType = vehicleType;
            return this;
        }

        public Builder setVehicleModel(String vehicleModel) {
            VehicleModel = vehicleModel;
            return this;
        }

        public Builder setVehicleYear(LocalDate vehicleYear) {
            VehicleYear = vehicleYear;
            return this;
        }

        public Builder setRegistration(Registration registration) {
            this.registration = registration;
            return this;
        }

        public Builder Copy(Vehicle vehicle) {
            this.VehicleID = vehicle.VehicleID;
            this.VehicleType = vehicle.VehicleType;
            this.VehicleModel = vehicle.VehicleModel;
            this.VehicleYear = vehicle.VehicleYear;
            this.registration = vehicle.registration;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
