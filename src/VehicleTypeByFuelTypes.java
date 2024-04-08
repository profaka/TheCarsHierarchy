public class VehicleTypeByFuelTypes extends VehicleType{
    public VehicleTypeByFuelTypes(String attribute) {
        super("Vehicle type by fuel type");
    }


    @Override
    public boolean equals(Object object){
        if(object == null || getClass() != object.getClass())
            return false;

        VehicleTypeByFuelTypes that = (VehicleTypeByFuelTypes) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }

}
