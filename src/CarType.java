public class CarType extends VehicleTypeByPurpose{

    public CarType(String attribute) {
        super("Car Type");
    }


    @Override
    public String getTypeName(){
        return VehicleTypeEnum.CAR.name();
    }
}
