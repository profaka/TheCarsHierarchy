public class BusType extends VehicleTypeByBodyTypes{
    public BusType(){
        super("Bus type");
    }


    @Override
    public String getTypeName(){
        return VehicleTypeEnum.BUS.name();
    }
}
