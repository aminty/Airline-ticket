package domain.airline_service;

public abstract class AirlineServiceDecorator extends AirlineService {
    protected AirlineService additionalService;

    public AirlineServiceDecorator(AirlineService additionalService) {
        this.additionalService = additionalService;
    }
}
