package domain.airline_service;

public class Base extends AirlineService{
    @Override
    public double cost() {
        return 60_000;
    }

    @Override
    public String description() {
        return "";
    }
}
