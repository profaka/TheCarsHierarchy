public class PassengerType extends VehicleTypeByPurpose{

    public PassengerType() {
        super("Passanger");
    }


    @Override
    public String getTypeName(){
        return VehicleTypeEnum.PASSENGER.name();
    }
}
