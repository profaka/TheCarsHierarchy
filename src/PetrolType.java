public class PetrolType extends VehicleTypeByFuelTypes{
    public PetrolType(){
        super("Petrol");
    }


    @Override
    public String getTypeName(){
        return VehicleTypeEnum.PETROL.name();
    }
}
