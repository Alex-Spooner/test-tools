package ru.testing.notes.jdbc.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.testing.notes.jdbc.model.Case;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Gosh on 12.11.2016.
 */
public class CaseRowMapper implements RowMapper<Case> {
    public static final String ID = "id";
    public static final String SUMMARY = "summary";
    public static final String STEPS = "steps";

    @Override
    public Case mapRow(ResultSet resultSet, int i) throws SQLException {
        Case currentCase = new Case();
        currentCase.setId(resultSet.getInt(ID));
        currentCase.setSteps(resultSet.getString(STEPS));
        currentCase.setSummary(resultSet.getString(SUMMARY));
        return currentCase;
    }
}
