public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());

        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());

        VehicleAd alphard = new VehicleAd("Alphard", "777", new PassengerType(),
                new WagonType(), new DieselType());


        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, alphard});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        System.out.println();

        adsService.filterByVehicleTypeByPurpose(new TruckType());
        System.out.println();

        adsService.filterByVehicleTypeByBodyTypes(new WagonType());
        System.out.println();

        adsService.filterByVehicleTypeByFuelTypes(new DieselType());

    }
}

