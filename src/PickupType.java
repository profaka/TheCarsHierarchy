public class PickupType extends VehicleTypeByBodyTypes{
    public PickupType(){
        super("Puckup");
    }

    @Override
    public String getTypeName(){
        return VehicleTypeEnum.PICKUP.name();
    }
}
