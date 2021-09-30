package domain.airline_service;

public class Food extends AirlineAsDecorator {
    public Food(AirlineAs additionalService) {
        super(additionalService);
    }

    @Override
    public double cost() {
        return 25_000+additionalService.cost();
    }

    @Override
    public String description() {
        return "Food /"+ additionalService.description();
    }
}
