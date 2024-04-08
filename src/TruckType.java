public class TruckType extends VehicleTypeByPurpose{

    public TruckType() {
        super("Truck Type");
    }


    @Override
    public String getTypeName(){
        return VehicleTypeEnum.TRUCK.name();
    }
}
