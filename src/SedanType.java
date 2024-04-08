public class SedanType extends VehicleTypeByBodyTypes{

    public SedanType() {
        super("Sedan Type");
    }


    @Override
    public String getTypeName(){
        return VehicleTypeEnum.SEDAN.name();
    }
}
