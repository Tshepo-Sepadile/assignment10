package ac.za.cput.service.demography.impl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.repository.demography.GenderRepository;
import ac.za.cput.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private GenderRepository genderRepository = null;

    @Override
    public Gender create(Gender gender)
    {
        return this.genderRepository.create(gender);
    }

    @Override
    public Gender update(Gender gender)
    {
        return this.genderRepository.update(gender);
    }

    @Override
    public void delete(String s)
    {
        genderRepository.delete(s);
    }

    @Override
    public Gender read(String s)
    {
        return this.genderRepository.read(s);
    }


    @Override
    public Set<Gender> getAll()
    {
        return genderRepository.getAll();
    }
}
