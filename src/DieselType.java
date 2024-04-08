public class DieselType extends VehicleTypeByFuelTypes{
    public DieselType(){
        super("Diesel Type");
    }


    @Override
    public String getTypeName(){
        return VehicleTypeEnum.DIESEL.name();
    }
}
