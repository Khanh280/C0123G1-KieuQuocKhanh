package case_study_furama.models;

public class Room extends Facility {
    private String freeService;//dich vu mien phi

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String servicename, double areaUsed, double rentalCost, int maximumPeople, String rentalType, String freeService) {
        super(servicename, areaUsed, rentalCost, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
