package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.CountryMst;
import java.util.List;

/**
 * @author yunbo.tao
 */
public interface CountryOrganizationRepository {

    List<CountryMst> findCountryMst();
}
