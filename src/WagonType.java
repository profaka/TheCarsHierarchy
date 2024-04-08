public class WagonType extends VehicleTypeByBodyTypes{
    public WagonType(){
        super("Wagon type");
    }


    @Override
    public String getTypeName(){
        return VehicleTypeEnum.WAGON.name();
    }
}
