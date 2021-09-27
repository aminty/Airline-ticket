package domain.airline_service;

public class Insurance extends AirlineServiceDecorator{
    public Insurance(AirlineService additionalService) {
        super(additionalService);
    }

    @Override
    public double cost() {
        return 350_000+ additionalService.cost();
    }

    @Override
    public String description() {
        return "Travel Insurance /"+additionalService.description();
    }
}
