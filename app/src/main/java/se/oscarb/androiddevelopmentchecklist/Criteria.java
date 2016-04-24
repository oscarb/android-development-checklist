package se.oscarb.androiddevelopmentchecklist;

import java.util.ArrayList;
import java.util.List;


public class Criteria {
    /*
        Instance variables
     */
    private String area;
    private String id;
    private String description;
    private String shortDescription;
    private List<TestProcedure> testProcedures;
    private boolean isChecked;

    /*
        Static variables
     */
    private static final int SHORT_DESCRIPTION_LENGTH = 30;

   /*
        Constructors
     */
    public Criteria() {
        area = null;
        id = null;
        description = null;
        shortDescription = null;
        testProcedures = new ArrayList();
        isChecked = false;
    }

    public Criteria(String area, String id, String description) {
        this();
        this.area = area;
        this.id = id;
        this.description = description;
        // Add automatic short description from full description
        if(description.length() > SHORT_DESCRIPTION_LENGTH) {
            this.shortDescription = description.substring(0, SHORT_DESCRIPTION_LENGTH);
            shortDescription.trim();
            shortDescription += "...";
        }
    }

    public Criteria(String area, String id, String description, String shortDescription) {
        this();
        this.area = area;
        this.id = id;
        this.description = description;
        this.shortDescription = shortDescription;
    }

    public Criteria(String area, String id, String description, String shortDescription,
                    List<TestProcedure> testProcedures) {
        this();
        this.area = area;
        this.id = id;
        this.description = description;
        this.testProcedures = testProcedures;
    }

    /*
        Methods - Getters
     */
    public String getArea() {
        return area;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public List<TestProcedure> getTestProcedures() {
        return testProcedures;
    }

    /*
        Methods - Setters
     */
    public void addTestProcedure(TestProcedure testProcedure) {
        testProcedures.add(testProcedure);
    }

    public void setChecked() {
        isChecked = true;
    }

    public void setUnchecked() {
        isChecked = false;
    }

    public void toggleChecked() {
        isChecked = !isChecked;
    }

}
