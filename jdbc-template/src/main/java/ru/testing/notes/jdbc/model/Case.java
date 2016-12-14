package ru.testing.notes.jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by Gosh on 12.11.2016.
 */
@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Case implements Serializable {
    private int id;
    private String summary;
    private String steps;

    public Case(String summary, String testData) {
        this.summary = summary;
        this.steps = testData;
    }

}

