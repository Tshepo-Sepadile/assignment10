package ac.za.cput.repository.demography.impl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl repository;
    private static Set<Gender> genders;

    private GenderRepositoryImpl()
    {
        this.genders = new HashSet<>();
    }

    public static GenderRepository getRepository()
    {
        if(repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }

    public Gender create(Gender gender)
    {
        this.genders.add(gender);
        return gender;
    }

    public Gender read(String genderCode)
    {
        this.genders.contains(genderCode);
        return null;
    }

    public Gender update(Gender gender)
    {
        if(genders == gender)
        {
            this.genders.add(gender);
        }
        return gender;
    }

    public void delete(String genderCode)
    {
        this.genders.remove(genderCode);
    }

    public Set<Gender>getAll()
    {
        return this.genders;
    }
}
