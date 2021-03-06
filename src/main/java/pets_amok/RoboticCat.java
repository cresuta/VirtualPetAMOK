package pets_amok;

public class RoboticCat extends Cat implements Robotic {

    private int oilMaintenanceLevel;

    public RoboticCat(String name, String description) {
        super(name, description);
        this.oilMaintenanceLevel = 50;
    }

    @Override
    public void updateVirtualPetFields() {
        this.oilMaintenanceLevel -= random.nextInt(7);
    }

    public int getOilMaintenanceLevel() {
        return oilMaintenanceLevel;
    }

    public void setOilMaintenanceLevel(int oilMaintenanceLevel) {
        this.oilMaintenanceLevel = oilMaintenanceLevel;
    }

    @Override
    public void oilRoboticPet() {
        oilMaintenanceLevel += 15;
    }

}
