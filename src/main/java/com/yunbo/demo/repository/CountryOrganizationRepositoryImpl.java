package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.CountryMst;
import com.yunbo.demo.db.model.CountryMstExample;
import com.yunbo.demo.mapper.CountryMstMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class CountryOrganizationRepositoryImpl implements CountryOrganizationRepository{
    private final CountryMstMapper countryMstMapper;
    @Override
    public List<CountryMst> findCountryMst() {
        CountryMstExample countryMstExample = new CountryMstExample();
        countryMstExample.setOrderByClause("sort ASC");
        return this.countryMstMapper.selectByExample(countryMstExample);
    }
}
