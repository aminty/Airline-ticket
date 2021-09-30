package domain.airline_service;

public class Business extends AirlineAsDecorator {

    public Business(AirlineAs additionalService) {
        super(additionalService);
    }

    @Override
    public double cost() {
        return 100_000 + additionalService.cost();
    }

    @Override
    public String description() {
        return "Business class /" +additionalService.description();
    }
}
