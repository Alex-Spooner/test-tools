package ru.testing.notes.jdbc.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import ru.testing.notes.jdbc.model.Case;

import java.util.List;

/**
 * Created by Gosh on 12.11.2016.
 */
public class CaseDao extends JdbcDaoSupport {

    private static final String LOAD_CASES_SQL = "insert into test_case (summary, steps) values ";

    private static final String GET_ALL_CASES_SQL = "select * from test_case";

    public static final String[][] CASE_INIT_DATA =
            {{"Test feature 1", "Do this, click this"},
                    {"Test feature 2", "Enter this, click this"}};

    private static final RowMapper<Case> CASE_ROW_MAPPER = new CaseRowMapper();

    public List<Case> getCaseList() {
        return getJdbcTemplate()
                .query(GET_ALL_CASES_SQL, CASE_ROW_MAPPER);
    }

    public void loadCases() {
        for (String[] caseData : CASE_INIT_DATA) {
            String sql = LOAD_CASES_SQL + "('" + caseData[0] + "', '"
                    + caseData[1] + "');";
            getJdbcTemplate().execute(sql);
        }
    }

}
