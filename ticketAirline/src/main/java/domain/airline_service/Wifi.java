package domain.airline_service;

public class Wifi extends AirlineServiceDecorator{
    public Wifi(AirlineService additionalService) {
        super(additionalService);
    }

    @Override
    public double cost() {
        return 20_000 + additionalService.cost();
    }

    @Override
    public String description() {
        return "Wifi /"+ additionalService.description();
    }
}
