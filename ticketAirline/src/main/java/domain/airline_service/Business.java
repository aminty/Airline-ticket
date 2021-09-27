package domain.airline_service;

public class Business extends AirlineServiceDecorator{

    public Business(AirlineService additionalService) {
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
