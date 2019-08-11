package ac.za.cput.factory.demography;

import ac.za.cput.domain.demography.Gender;

public class GenderFactory {

    public static Gender getGender(String genderId, String description)
    {
        return new Gender.Builder().genderId(genderId).description(description).build();
    }
}
