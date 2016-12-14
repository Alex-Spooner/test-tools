package ru.testing.notes.jdbc.test;

import lombok.extern.log4j.Log4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.testing.notes.jdbc.dao.CaseDao;
import ru.testing.notes.jdbc.model.Case;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class JdbcTest {

    @Autowired
    private CaseDao caseDao;

    private List<Case> expectedCaseList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        initExpectedCaseLists();
        caseDao.loadCases();
    }


    @Test
    @DirtiesContext
    public void testCaseList() {

        log.info("-----Start country list test------");

        List<Case> actualCaseList = caseDao.getCaseList();
        assertNotNull(actualCaseList);
        assertEquals(expectedCaseList.size(), actualCaseList.size());

        for (int i = 0; i < expectedCaseList.size(); i++) {
            Case expectedCase = expectedCaseList.get(i);
            Case actualCase = actualCaseList.get(i);
            log.info("Expected case is " + expectedCase.toString());
            log.info("Actual case is " + actualCase.toString());
            assertEquals(expectedCase, actualCase);
        }

        log.info("-----End country list test------");
    }

    private void initExpectedCaseLists() {
        for (int i = 0; i < CaseDao.CASE_INIT_DATA.length; i++) {
            String[] caseInitData = CaseDao.CASE_INIT_DATA[i];
            Case currentCase = new Case(i, caseInitData[0], caseInitData[1]);
            expectedCaseList.add(currentCase);
        }
    }

}
