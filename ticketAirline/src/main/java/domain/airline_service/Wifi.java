package domain.airline_service;

public class Wifi extends AirlineAsDecorator {
    public Wifi(AirlineAs additionalService) {
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
