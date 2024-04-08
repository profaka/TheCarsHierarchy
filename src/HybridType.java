public class HybridType extends VehicleTypeByFuelTypes{
    public HybridType(){
        super("Hybrid type");
    }


    @Override
    public String getTypeName(){
        return VehicleTypeEnum.HYBRID.name();
    }
}
