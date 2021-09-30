package domain.airline_service;

public abstract class AirlineAsDecorator extends AirlineAs {
    protected AirlineAs additionalService;

    public AirlineAsDecorator(AirlineAs additionalService) {
        this.additionalService = additionalService;
    }
}
