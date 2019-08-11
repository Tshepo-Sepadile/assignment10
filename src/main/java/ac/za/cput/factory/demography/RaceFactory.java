package ac.za.cput.factory.demography;

import ac.za.cput.domain.demography.Race;

public class RaceFactory {

    public static Race getRace(String raceId, String description)
    {
        return new Race.Builder().raceId(raceId).description(description).build();
    }
}
