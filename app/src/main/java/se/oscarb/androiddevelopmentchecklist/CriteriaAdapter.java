package se.oscarb.androiddevelopmentchecklist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;


public class CriteriaAdapter extends RecyclerView.Adapter<CriteriaAdapter.ViewHolder> {

    /*
        Instance variables
     */
    private List<Criterion> criteria;

    /*
        Constructors
     */
    public CriteriaAdapter(List<Criterion> criteria) {
        this.criteria = criteria;
    }

    /*
        Methods from RecyclerView.Adapter
     */

    /*
        Inflate item view and return ViewHolder
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate item layout
        View criterionView = inflater.inflate(R.layout.item_criterion, parent, false);

        // Create ViewHolder instance
        ViewHolder viewHolder = new ViewHolder(criterionView);

        return viewHolder;
    }

    /*
        Populate data
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Get the criterion for this position
        Criterion criterion = criteria.get(position);

        // Get Views from ViewHolder
        TextView textView = holder.descriptionTextView;
        CheckBox checkBox = holder.checkBox;

        // Set data
        textView.setText(criterion.getDescription());
        checkBox.setChecked(true);

    }

    /*
        Returns the total count of rows to show
     */
    @Override
    public int getItemCount() {
        return criteria.size();
    }

    /*
       The ViewHolder that will reference each view in the list to optimize performance
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public CheckBox checkBox;
        public TextView descriptionTextView;

        public ViewHolder (View itemView) {
            super(itemView);

            // Views from item in list
            checkBox = (CheckBox) itemView.findViewById(R.id.checkbox);
            descriptionTextView = (TextView) itemView.findViewById(R.id.description);
        }
    }


}
