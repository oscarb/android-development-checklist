package se.oscarb.androiddevelopmentchecklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*
        Instance variables
     */
    private List<Criterion> criteria;
    RecyclerView criteriaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get Views
        criteriaList = (RecyclerView) findViewById(R.id.criteria_list);

        // Create mock criteria
        criteria = Criterion.createCriteriaList(20);

        // Create adapter with mock data
        CriteriaAdapter adapter = new CriteriaAdapter(criteria);

        // Attach adapter to RecyclerView to populate data
        criteriaList.setAdapter(adapter);

        // Set default layout manager to position items vertically
        criteriaList.setLayoutManager(new LinearLayoutManager(this));

    }
}
