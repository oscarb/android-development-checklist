package se.oscarb.androiddevelopmentchecklist;


public class TestProcedure {
    /*
        Instance variables
     */
    private String id;
    private String type;
    private String description;

    /*
        Constructors
     */

    public TestProcedure() {
        id = null;
        type = null;
        description = null;
    }

    public TestProcedure(String id, String type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }

    /*
        Methods - Getters
     */
    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
