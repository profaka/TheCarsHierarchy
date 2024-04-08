public class ElectricType extends VehicleTypeByFuelTypes{
    public ElectricType(){
        super("Electric type");
    }


    @Override
    public String getTypeName(){
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
